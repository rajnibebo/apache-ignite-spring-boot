package com.rajni.apacheignite.model;

public enum Gender {
    FEMALE("F"), MALE("M"), TRANSGENDER("T"), UNKNOWN("U");

    private final String indicator;

    Gender(String indicator) {
        this.indicator = indicator;
    }

    public String getIndicator() {
        return indicator;
    }
}
