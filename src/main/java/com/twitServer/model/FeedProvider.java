package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class FeedProvider {

    @Id
    private String id;

    // Feed id
    private int feedId;

    // Feed information
    private String label;
    private Boolean active;

    public void setFeedProvider(int feedId, String label, Boolean active) {
        this.feedId = feedId;
        this.label = label;
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public int getFeedId() {
        return feedId;
    }

    public String getLabel() {
        return label;
    }

    public Boolean getActive() {
        return active;
    }
}
