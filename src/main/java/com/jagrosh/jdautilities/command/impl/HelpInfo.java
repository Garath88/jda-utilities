package com.jagrosh.jdautilities.command.impl;

public class HelpInfo {
    private String helpText = "";
    private String imageUrl = null;

    public HelpInfo() {
    }

    public HelpInfo(String helpText, String imageUrl) {
        this.helpText = helpText;
        this.imageUrl = imageUrl;
    }

    String getHelpText() {
        return helpText;
    }

    String getImageUrl() {
        return imageUrl;
    }
}
