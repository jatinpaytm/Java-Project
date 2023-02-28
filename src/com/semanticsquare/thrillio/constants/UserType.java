package com.semanticsquare.thrillio.constants;

public enum UserType {
    
    // as they are constants we need to write them in AllCaps
    USER("user"),
    EDITOR("editor"),
    CHIEF_EDITOR("chiefeditor");

    private UserType(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    private String name;


}
