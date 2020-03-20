package com.javaspringappv4.demo.model;

//This is called a POJO --> make an instance of this model to structure your data & store it into your database
//thought process --> have a form submission for announcements --> upload that to database --> render that on client side as a feed

public class announcementModel {
    private final int id;
    private String day;
    private String date;
    private String announcementArray[];

    public announcementModel(int id, String day, String date, String[] announcementArray) {
        this.id = id;
        this.day = day;
        this.date = date;
        this.announcementArray = announcementArray;
    }

    public int getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getAnnouncementArray() {
        return announcementArray;
    }

    public void setAnnouncementArray(String[] announcementArray) {
        this.announcementArray = announcementArray;
    }
}
