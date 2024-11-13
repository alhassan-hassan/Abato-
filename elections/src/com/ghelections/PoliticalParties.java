package com.ghelections;

//Acts as a virtual pink sheet or a master realtime votes/results tracker.
public enum PoliticalParties {
    
    /**
     * The constants contain:
     * Name of the political candidate of the party(abbreviated),
     * Position on the ballot paper to make vote counting easier,
     * Votes in real time(as and when voting is going on)
     */
    APC("Hassan Ayariga", 7, 0),
    CPP("Ivor Kobina Greenstreet", 4, 0),
    GCPP("Henry Herbert Lartey", 6, 0),
    GFP("Madam Akua Donkor", 5, 0),
    GUM("Christian Kwabena Andrews", 3, 0),
    INDEPENDENT("Asiedu Walker", 9, 0),
    LPG("Kofi Akpaloo", 8, 0),
    NDC("John Dramani Mahama", 2, 0),
    NDP("Nana Konadu Agyeman-Rawlings", 11, 0),
    NPP("Nana Addo Dankwa Akufo-Addo", 1, 0),
    PNC("David Apasera", 9, 0),
    PPP("Brigitte Dzogbenuku", 10, 0);

    //Instance variables
    private final String candidateName;
    private int numberOfVotes;
    private int position;

    /**
     * Constructor: initializes the name, position and votes of the instantiated constant
     * @param candidateName represents the name of the candidate of the political party.
     * @param position represents the candidate's on the ballot paper.
     * @param numberOfVotes represents the num
     */
    PoliticalParties(String candidateName, int position, int numberOfVotes) {
        this.candidateName = candidateName;
        this.position = position;
        this.numberOfVotes = numberOfVotes;
    }

    /**
     * This method gets the current number of votes of a political party
     * @return the number of votes of a party
     */
    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    /**
     * This method gets the name of the candidate representing the political party.
     * @return the name of the political candidate of the party.
     */
    public String getCandidate() {
        return candidateName;
    }

    /**
     * This method changes the number of votes of a political party
     * @param numberOfVotes represents the current number of votes of a political party.
     */
    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

}

