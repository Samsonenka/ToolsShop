package com.example.toolsshop.models;

public class Hammer {

    private String title;
    private String info;
    private int imgResID;

    public Hammer(String title, String info, int imgResID) {
        this.title = title;
        this.info = info;
        this.imgResID = imgResID;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImgResID() {
        return imgResID;
    }
}
