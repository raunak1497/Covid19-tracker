package com.raunak.Covid19tracker.models;

public class LocationStats {
    private String state;
    private String country;
    private  int latestCases;
    private int newCases;


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

    public int getLatestCases() {
        return latestCases;
    }

    public void setLatestCases(int latestCases) {
        this.latestCases = latestCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state ='" + state + '\'' +
                ", country ='" + country + '\'' +
                " latestCases ='" + latestCases + '\'' +
                '}';
    }

    public int getNewCases() {
        return newCases;
    }

    public void setNewCases(int newCases) {
        this.newCases = newCases;
    }
}
