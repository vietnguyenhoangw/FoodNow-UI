package com.example.foodnowapp;

public class Home {
    private int homeImage;
    private String homeTitle;
    private String homeLocation;
    String Test;

    public Home(int homeImage, String homeTitle, String homeLocation) {
        this.homeImage = homeImage;
        this.homeTitle = homeTitle;
        this.homeLocation = homeLocation;
    }

    public int getHomeImage() {
        return homeImage;
    }

    public void setHomeImage(int homeImage) {
        this.homeImage = homeImage;
    }

    public String getHomeTitle() {
        return homeTitle;
    }

    public void setHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }
}
