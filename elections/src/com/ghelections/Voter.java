package com.ghelections;

import java.time.LocalDate;

public class Voter extends Person{
    //Instance variables
    private final long VOTER_ID;
    private PollingStation pollingStation;
    private String homeTown;

    //Constructor
    /**
     * Default constructor:
     * Sets parameters to defaults
     */
    public Voter(){
        this(new Person(),"GH", 0);
    }

    /**
     * Parametric constructor
     * @param homeTown represents the native origin of the voter.
     * @param VOTER_ID represents the unique identity of the voter.
     */
    public Voter(String homeTown, long VOTER_ID){
        super();
        this.pollingStation = new PollingStation("Not registered");
        this.VOTER_ID = VOTER_ID;
        this.homeTown = homeTown;
    }

    /**
     * Parametric construction
     * @param person represents the relevant details of the voter as a person.
     * @param homeTown represents the native origin of the voter.
     * @param VOTER_ID represents the unique identity of the voter.
     */
    public Voter(Person person,String homeTown, long VOTER_ID){
        super(person.getName(), person.getDateOfBirth(), person.getGender().charAt(0));
        this.pollingStation = new PollingStation("Not registered");
        this.VOTER_ID = VOTER_ID;
        this.homeTown = homeTown;
    }

    /**
     * Parametric constructor
     * @param name represents the name of the voter.
     * @param dob represents the date of birth of the voter.
     * @param gender represents the gender of the the voter.
     * @param homeTown represents the native origin of the voter.
     * @param VOTER_ID represents the unique identity of the voter.
     */
    public Voter(String name, LocalDate dob, char gender, String homeTown, long VOTER_ID){
        super(name, dob, gender);
        this.pollingStation = new PollingStation("Not registered");
        this.VOTER_ID = VOTER_ID;
        this.homeTown = homeTown;
    }

    //Accessor methods
    /**
     * To access a voter's polling station
     * @return the polling station name as a string
     */
    public String getPollingStation() {
        return pollingStation.getPollingStationName();
    }

    /**
     * To access a voter's id
     * @return the voter's identity number as a string
     */
    public long getVOTER_ID() {
        return VOTER_ID;
    }

    /**
     * To get the voter's hometown
     * @return the hometown of the voter as a string
     */
    public String getHomeTown() {
        return homeTown;
    }

    //Mutator methods
    public void setPollingStation(PollingStation pollingStation) {
        this.pollingStation = pollingStation;
    }
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    //Auxiliary methods
    /**
     * To allow and track voters while they cast vote
     */
    public void castVote(int position){
        if(!this.hasVoted() && !this.pollingStation.getPollingStationName().equals("Not registered")){
            this.pollingStation.voted.add(this);
            this.pollingStation.votes.set(position-1, this.pollingStation.votes.get(position-1)+1);
        }
        else if(this.pollingStation.getPollingStationName().equals("Not registered")){
            System.out.println("YOU DO NOT HAVE A POLLING STATION YET!");
        }
        else{ System.out.println("CANNOT VOTE TWICE!"); }
    }

    /**
     * Checks if the voter has already voted or not
     * @return true if voter exists in voted list and false if otherwise
     */
    private boolean hasVoted(){
        return this.pollingStation.voted.contains(this);
    }


    /**
     * toString method overridden from the Object class
     * @return the voter's relevant details to any user
     */
    @Override
    public String toString() {
        if(this.getGender().equals("Male")){
            return super.toString()+
                    "\nVotes at: "+pollingStation.getPollingStationName()+
                    "\nVoter's ID: "+VOTER_ID;
        }else{
            return super.toString()+
                    "\nVotes At: "+pollingStation.getPollingStationName()+
                    "\nVoter's ID: "+VOTER_ID;
        }

    }
}

