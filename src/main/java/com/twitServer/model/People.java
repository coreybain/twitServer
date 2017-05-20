package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class People {

    @Id
    private String id;
    private String peopleId;

    private String label;
    private String bio;
    private String bioSummary;

    private String []showDate;
    private int []shows;
    private String contactInfo;
    private String tagline;
    private String positionTitle;
    private Boolean staff;
    private String published;

    private String createdDate;
    private String changeDate;
}
