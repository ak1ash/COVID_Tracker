package com.covid.covid_tracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latest_total_cases;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatest_total_cases() {
        return latest_total_cases;
    }

    public void setLatest_total_cases(int latest_total_cases) {
        this.latest_total_cases = latest_total_cases;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latest_total_cases=" + latest_total_cases +
                '}';
    }
}
