package com.ghelections;

import java.util.Arrays;
import java.util.Stack;


abstract class NationalCollationCenter{
    //Class variable
    public static Stack<Region.Rcc> regions = new Stack<>();

    /**
     * This void method adds the regions to the regions list to show that their regional results have been submitted
     * @param rcc represents variable arguments as regions that are added to the regions stack
     */
    public static void addRegion(Region.Rcc... rcc){
        regions.addAll(Arrays.asList(rcc));
    }

    private static int getNppResults() {
        int results = 0;
        //Accumulates all results and the political party.
        for (Region.Rcc each : regions) {
            results += each.getNppResults();
        }
        //Sets the accumulated votes to the original enum type(virtual pink sheet)
        PoliticalParties.NPP.setNumberOfVotes(results);
        //The number of the votes from the "pink sheet".
        return PoliticalParties.NPP.getNumberOfVotes();
    }
    private static int getNdcResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getNdcResults();
        }
        PoliticalParties.NDC.setNumberOfVotes(results);
        return PoliticalParties.NDC.getNumberOfVotes();
    }
    private static int getGumResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getGumResults();
        }
        PoliticalParties.GUM.setNumberOfVotes(results);
        return PoliticalParties.GUM.getNumberOfVotes();
    }
    private static int getCppResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getCppResults();
        }
        PoliticalParties.CPP.setNumberOfVotes(results);
        return PoliticalParties.CPP.getNumberOfVotes();
    }
    private static int getGfpResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getGfpResults();
        }
        PoliticalParties.GFP.setNumberOfVotes(results);
        return PoliticalParties.GFP.getNumberOfVotes();
    }
    private static int getGcppResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getGcppResults();
        }
        PoliticalParties.GCPP.setNumberOfVotes(results);
        return PoliticalParties.GCPP.getNumberOfVotes();
    }
    private static int getApcResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getApcResults();
        }
        PoliticalParties.APC.setNumberOfVotes(results);
        return PoliticalParties.APC.getNumberOfVotes();    }
    public static int getLpgResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getLpgResults();
        }
        PoliticalParties.LPG.setNumberOfVotes(results);
        return PoliticalParties.LPG.getNumberOfVotes();
    }
    public static int getPncResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getPncResults();
        }
        PoliticalParties.PNC.setNumberOfVotes(results);
        return PoliticalParties.PNC.getNumberOfVotes();
    }
    public static int getPppResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getPppResults();
        }
        PoliticalParties.PPP.setNumberOfVotes(results);
        return PoliticalParties.PPP.getNumberOfVotes();
    }
    public static int getNdpResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getNdpResults();
        }
        PoliticalParties.NDP.setNumberOfVotes(results);
        return PoliticalParties.NDP.getNumberOfVotes();    }
    public static int getIndpResults() {
        int results = 0;
        for (Region.Rcc each : regions) {
            results += each.getIndpResults();
        }
        PoliticalParties.INDEPENDENT.setNumberOfVotes(results);
        return PoliticalParties.INDEPENDENT.getNumberOfVotes();
    }

    /**
     * The method returns a summary of all votes for the submitted regions.
     * @return the summary of the voting process from the polling station stage through the district level
     */
    public static String Summary(){
        return  "\nRegions whose results are in: " + NationalCollationCenter.regions.size() +
                "\n\n\t\t\t\t NATIONAL RESULTS:\n\t\t\t\t\t" +
                PoliticalParties.NPP.name() + " : " + getNppResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.NDC.name() + " : " + getNdcResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.GUM.name() + " : " + getGumResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.CPP.name() + " : " + getCppResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.GFP.name() + " : " + getGfpResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.GCPP.name() + " : " + getGcppResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.APC.name() + " : " + getApcResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.LPG.name() + " : " + getLpgResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.PNC.name() + " : " + getPncResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.PPP.name() + " : " + getPppResults() + " votes" + "\n\t\t\t\t\t" +
                PoliticalParties.NDP.name() + " : " + getNdpResults() + " votes" + "\n\t\t\t" +
                PoliticalParties.INDEPENDENT.name() + " : " + getIndpResults() + " votes" + "\n";
    }

    /**
     * This method declares the winner(when their percentage is greater than 50) when all regional results are in.
     */
    public static void Declaration(){
        double winner = 0;
        double total = 0;
        String president = "";
        String decision = "";

        //Checking if all 16 regions have brought their results
        if(regions.size() == 16) {
            //Checks the maximum number of votes and gets the total number of votes
            for (PoliticalParties p : PoliticalParties.values()) {
                total += p.getNumberOfVotes();
                if (p.getNumberOfVotes() > winner) {
                    winner = p.getNumberOfVotes();
                    president = p.getCandidate();
                }
            }

            //Checks the percentage of the winning vote and makes a decision thereof
            decision = ((winner / total) >= 0.5) ? president+" is the president elect of Ghana"
                                                 : "We are anticipating a run-off";
            System.out.println(decision);
        }else{
            System.out.println("Voting is not over yet");
        }
    }
}

