package com.example.votesfx213a2026;

import java.time.LocalDate;

/**
 * This class represents a vote with details about the voter and their chosen party.
 *
 * @author Zsolt Harmath
 * @implSpec TODO: Implement getters and setters for the fields, and consider adding validation for the input data.
 */
public class Vote {
    public String id;
    public String firstName;
    public String lastName;
    public LocalDate birthday;
    public String address;
    public String votedParty;

    /**
     * Creates a new Vote instance.
     *
     * @param id the ID of the vote in the format "123NNNXX" where NNN is a number and XX are letters
     * @param firstName the first name of the voter
     * @param lastName the last name of the voter
     * @param birthday the birthday of the voter in the format "YYYY-MM-DD"
     * @param address the address of the voter
     * @param votedParty the party that the voter voted for, like "TISZA", "FIDESZ", or "Mi Hazánk"
     */
    public Vote(String id, String firstName, String lastName, String birthday, String address, String votedParty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = LocalDate.parse(birthday);
        this.address = address;
        this.votedParty = votedParty;
    }
}
