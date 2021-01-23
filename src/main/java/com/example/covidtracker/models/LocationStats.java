package com.example.covidtracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int LatestTotalCases;
    private int diffFromPreviousDay;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return LatestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        LatestTotalCases = latestTotalCases;
    }

    @Override
    public String toString(){
        return "LoacaltionStats{" +
                "state=" + state + '\'' +
                ", country" + country + '\'' +
                ", latestTotalCases" + LatestTotalCases +
                '}';
    }

    public int getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(int diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }
}
