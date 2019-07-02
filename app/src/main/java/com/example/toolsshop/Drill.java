package com.example.toolsshop;

public class Drill {

    private String title;
    private String info;
    private int imgResID;

    public Drill(String title, String info, int imgResID) {
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

    @Override
    public String toString() {
        return title;
    }
}
