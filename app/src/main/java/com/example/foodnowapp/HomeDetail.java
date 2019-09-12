package com.example.foodnowapp;

public class HomeDetail extends Home {

    private int oderID;
    private String Map;
    private Double cash;
    private String driverName;
    private String driverNumber;

    public HomeDetail(int homeImage, String homeTitle, String homeLocation, int oderID,
                      String map, Double cash, String driverName, String driverNumber) {
        super(homeImage, homeTitle, homeLocation);
        this.oderID = oderID;
        Map = map;
        this.cash = cash;
        this.driverName = driverName;
        this.driverNumber = driverNumber;
    }

    public int getOderID() {
        return oderID;
    }

    public void setOderID(int oderID) {
        this.oderID = oderID;
    }

    public String getMap() {
        return Map;
    }

    public void setMap(String map) {
        Map = map;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }
}
