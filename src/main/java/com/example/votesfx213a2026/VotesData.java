package com.example.votesfx213a2026;

/**
 * This class generates an array of Vote objects with sample random data.
 *
 * @author Zsolt Harmath
 */
public class VotesData {
    public static final Vote[] votes = createVotes();

    private static Vote[] createVotes() {
        String[] firstNames = {
                "István", "László", "János", "Gábor", "Zoltán", "Ferenc", "András", "Péter",
                "Tamás", "Miklós", "Csaba", "Balázs", "Sándor", "Dániel", "Ádám", "Árpád",
                "Anna", "Katalin", "Mária", "Erzsébet", "Judit", "Zsuzsanna", "Eszter", "Ágnes",
                "Krisztina", "Andrea", "Réka", "Viktória", "Dóra", "Petra"
        };
        String[] lastNames = {
                "Nagy", "Kovács", "Tóth", "Szabó", "Horváth", "Varga", "Kiss", "Molnár",
                "Németh", "Farkas", "Balogh", "Papp", "Takács", "Juhász", "Lakatos", "Mészáros",
                "Oláh", "Simon", "Rácz", "Fekete", "Balla", "Szűcs", "Török", "Kovácsi"
        };
        String[] towns = {
                "Budapest", "Debrecen", "Szeged", "Miskolc", "Pécs", "Győr", "Nyíregyháza",
                "Kecskemét", "Székesfehérvár", "Szombathely", "Érd", "Tatabánya"
        };
        String[] streets = {
                "Petőfi utca", "Kossuth utca", "Rákóczi út", "Arany János utca", "Dózsa György út",
                "Ady Endre utca", "József Attila utca", "Széchenyi utca", "Bartók Béla út", "Munkácsy utca"
        };
        String[] parties = {"TISZA", "FIDESZ", "Mi Hazánk"};
        double[] partyProbabilities = {0.3, 0.6, 0.1}; // Probabilities for each party

        Vote[] generatedVotes = new Vote[120];
        for (int i = 0; i < generatedVotes.length; i++) {
            int firstNameIndex = i % firstNames.length;
            int lastNameIndex = (i * 7 + i / firstNames.length) % lastNames.length;
            char firstLetter = (char) ('A' + (i / 26));
            char secondLetter = (char) ('A' + (i % 26));
            String id = String.format("123%03d%c%c", i + 1, firstLetter, secondLetter);

            int year = 1950 + (i * 11) % 58;
            int month = 1 + i % 12;
            int day = 1 + (i * 7) % 28;
            String birthday = String.format("%04d-%02d-%02d", year, month, day);

            String town = towns[i % towns.length];
            String houseNumber = Integer.toString(1 + (i * 13) % 180);
            String address = town + ", " + streets[(i * 3) % streets.length] + " " + houseNumber + ".";

            generatedVotes[i] = new Vote(
                    id,
                    firstNames[firstNameIndex],
                    lastNames[lastNameIndex],
                    birthday,
                    address,
                    parties[getRandomPartyIndex(partyProbabilities)]
            );
        }
        return generatedVotes;
    }

    private static int getRandomPartyIndex(double[] partyProbabilities) {
        return Math.random() < partyProbabilities[0] ? 0 :
                (Math.random() < partyProbabilities[0] + partyProbabilities[1] ? 1 : 2);
    }
}
