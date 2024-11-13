package com.ghelections;

import com.ghelections.*;
import java.util.Stack;

public class DistrictCollationCenter implements CollationCenter{
    //Instance variables
    public final String districtName;
    private String region;
    public Stack<PollingStation> pollingStations = new Stack<>();

    /**
     * Constructor: initializes the name of the district and the region the district belongs to.
     * @param districtName represents the name of the district.
     */
    DistrictCollationCenter(String districtName) {
        this.districtName = districtName;
        this.region = "Not registered";
    }

    /**
     * The method adds a polling station to the current district.
     * @param pollingStation represents the
     */
    public void addPollingStation(PollingStation pollingStation) {
        pollingStations.add(pollingStation);
        pollingStation.setDistrict(this.districtName);
    }

    /**
     * The method returns the polling stations that belong to the district.
     * @return the added polling stations as a string.
     */
    public String getPollingStations() {
        return this.pollingStations.toString();
    }

    public int getNppResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getNppResults();
        }
        return results;
    }
    public int getNdcResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getNdcResults();
        }
        return results;
    }
    public int getGumResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getGumResults();
        }
        return results;
    }
    public int getCppResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getCppResults();
        }
        return results;
    }
    public int getGfpResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getGfpResults();
        }
        return results;
    }
    public int getGcppResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getGcppResults();
        }
        return results;
    }
    public int getApcResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getApcResults();
        }
        return results;
    }
    public int getLpgResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getLpgResults();
        }
        return results;
    }
    public int getPncResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getPncResults();
        }
        return results;
    }
    public int getPppResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getPppResults();
        }
        return results;
    }
    public int getNdpResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getNdpResults();
        }
        return results;
    }
    public int getIndpResults() {
        int results = 0;
        for (PollingStation each : pollingStations) {
            results += each.getIndpResults();
        }
        return results;
    }

    /**
     * The method returns a summary of all votes for the respective political parties.
     * @return the summary of the voting process and some relevant details as a string.
     */
    public String Summary() {
        return "District Name: " + districtName +
                "\nTotal polling stations under district: " + pollingStations.size() +
                "\n\nDISTRICT RESULTS:\n" +
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