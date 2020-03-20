package com.javaspringappv4.demo.controller;

import com.javaspringappv4.demo.model.announcementModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//this annotation is used to specify that we're making a rest api
@RestController //this annotation specifies that JSON will be returned
public class announcementController {

    //make a POST request for announcements

    @GetMapping("/getAnnouncements")
    public announcementModel getAllAnnouncement(){

        String[] listOfAnnouncements = {"announcement1", "announcement2", "announcement3", "announcement4"};

        //TODO: use dummy data to make this work then actually connect it to a database
        announcementModel allAnnouncementsObject = new announcementModel(10, "Monday", "10/28/1998", listOfAnnouncements);

        //return the newly created object --> this will be converted to JSON behind the scenes
        return allAnnouncementsObject;
    }

    //make a get request for an announcement on a specific day

}

