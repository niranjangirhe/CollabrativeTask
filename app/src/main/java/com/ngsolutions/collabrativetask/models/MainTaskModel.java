package com.ngsolutions.collabrativetask.models;

public class MainTaskModel {
    String Date, Title;
    int type;

    public MainTaskModel(String date, String title, int type) {
        Date = date;
        Title = title;
        this.type = type;
    }

    public String getDate() {
        return Date;
    }

    public String getTitle() {
        return Title;
    }

    public int getType() {
        return type;
    }
}
