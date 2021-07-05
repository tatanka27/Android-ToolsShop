package com.tata.toolsshop;

public class Drill {

    private  String title;
    private  String info;
    private  int resImgId;

    public Drill(String title, String info, int id) {
        this.title = title;
        this.info = info;
        this.resImgId = id;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getResImgId() {
        return resImgId;
    }

    @Override
    public String toString() {
        return title;
    }
}
