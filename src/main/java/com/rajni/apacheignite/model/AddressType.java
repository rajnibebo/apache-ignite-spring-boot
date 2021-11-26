package com.rajni.apacheignite.model;

public enum AddressType {
    RESIDENTIAL("R"), COMMERCIAL("C"), OFFICE("O");
    private final String type;

    AddressType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
