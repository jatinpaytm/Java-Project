package com.semanticsquare.thrillio.constants;

public enum KidFriendlyStatus {
    APPROVED("approved"),
    REJECTED("rejected"),
    UNKNOWN("unknown");

    private KidFriendlyStatus(String name) { // made this as private so that no one can create object of constant class
        this.name = name;
    }

    private String name;

    public String getStatus() {
        return name;
    }

}
