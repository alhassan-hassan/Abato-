package com.ghelections;

import java.util.*;

public class PollingStation {
    protected ArrayList<Voter> voted = new ArrayList<>(); //Class variable
    protected List<Integer> votes = new ArrayList<>(Collections.nCopies(12, 0));//Keep count of votes
    private final Stack<Voter> registeredVoters = new Stack<>();
    private final String pollingStationName;
    private String district;
    private String region;

    PollingStation(String pollingStationName){
        this.pollingStationName = pollingStationName;
        this.district = "Not registered";
        this.region = "Not registered";
    }

    public void addVoter(Voter voter){
        registeredVoters.add(voter);
        voter.setPollingStation(this);
    }

    public String getRegisteredVoters() {
        return registeredVoters.toString();
    }
    public String getPollingStationName() {
        return pollingStationName;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getNppResults() {
        PoliticalParties.NPP.setNumberOfVotes(votes.get(0));
        return PoliticalParties.NPP.getNumberOfVotes();
    }
    public int getNdcResults() {
        PoliticalParties.NDC.setNumberOfVotes(votes.get(1));
        return PoliticalParties.NDC.getNumberOfVotes();
    }
    public int getGumResults() {
        PoliticalParties.GUM.setNumberOfVotes(votes.get(2));
        return PoliticalParties.GUM.getNumberOfVotes();
    }
    public int getCppResults() {
        PoliticalParties.CPP.setNumberOfVotes(votes.get(3));
        return PoliticalParties.CPP.getNumberOfVotes();
    }
    public int getGfpResults() {
        PoliticalParties.GFP.setNumberOfVotes(votes.get(4));
        return PoliticalParties.GFP.getNumberOfVotes();
    }
    public int getGcppResults() {
        PoliticalParties.GCPP.setNumberOfVotes(votes.get(5));
        return PoliticalParties.GCPP.getNumberOfVotes();
    }
    public int getApcResults() {
        PoliticalParties.APC.setNumberOfVotes(votes.get(6));
        return PoliticalParties.APC.getNumberOfVotes();
    }
    public int getLpgResults() {
        PoliticalParties.LPG.setNumberOfVotes(votes.get(7));
        return PoliticalParties.LPG.getNumberOfVotes();
    }
    public int getPncResults() {
        PoliticalParties.PNC.setNumberOfVotes(votes.get(8));
        return PoliticalParties.PNC.getNumberOfVotes();
    }
    public int getPppResults() {
        PoliticalParties.PPP.setNumberOfVotes(votes.get(9));
        return PoliticalParties.PPP.getNumberOfVotes();
    }
    public int getNdpResults() {
        PoliticalParties.NDP.setNumberOfVotes(votes.get(10));
        return PoliticalParties.NDP.getNumberOfVotes();
    }
    public int getIndpResults() {
        PoliticalParties.INDEPENDENT.setNumberOfVotes(votes.get(11));
        return PoliticalParties.INDEPENDENT.getNumberOfVotes();
    }

    @Override
    public String toString(){
        return "Polling station: "+pollingStationName+
                "\nTotal valid votes cast: "+ voted.size()+
                "\nPOLLING STATION RESULTS:\n"+
                PoliticalParties.NPP.name()+" : "+getNppResults()+" votes"+"\n"+
                PoliticalParties.NDC.name()+" : "+getNdcResults()+" votes"+"\n"+
                PoliticalParties.GUM.name()+" : "+getGumResults()+" votes"+"\n"+
                PoliticalParties.CPP.name()+" : "+getCppResults()+" votes"+"\n"+
                PoliticalParties.GFP.name()+" : "+getGfpResults()+" votes"+"\n"+
                PoliticalParties.GCPP.name()+" : "+getGcppResults()+" votes"+"\n"+
                PoliticalParties.APC.name()+" : "+getApcResults()+" votes"+"\n"+
                PoliticalParties.LPG.name()+" : "+getLpgResults()+" votes"+"\n"+
                PoliticalParties.PNC.name()+" : "+getPncResults()+" votes"+"\n"+
                PoliticalParties.PPP.name()+" : "+getPppResults()+" votes"+"\n"+
                PoliticalParties.NDP.name()+" : "+getNdpResults()+" votes"+"\n"+
                PoliticalParties.INDEPENDENT.name()+" : "+getIndpResults()+" votes"+"\n";
    }
    
    
    
}
