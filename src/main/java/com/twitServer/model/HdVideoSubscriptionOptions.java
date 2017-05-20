package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class HdVideoSubscriptionOptions {

    @Id
    private String id;

    // Video id
    private int videoId;

    // Video information
    private String label;
    private String url;
    private String type;
    private String sticky;

    // Twit show creation info
    private String created;
    private String changed;

    private FeedProvider feedProvider;

    public void setHdVideoSubscriptionOptions(int videoId, String label, String url, String type, String sticky,
                                    String created, String changed, FeedProvider feedProvider) {
        this.videoId = videoId;
        this.label = label;
        this.url = url;
        if (type != null) {
            this.type = type;
        }
        if (sticky != null) {
            this.sticky = sticky;
        }
        if (created != null) {
            this.created = created;
        }
        if (changed != null) {
            this.changed = changed;
        }
        if (feedProvider != null) {
            this.feedProvider = feedProvider;
        }
    }

    public String getId() {
        return id;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getLabel() {
        return label;
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return type;
    }

    public String getSticky() {
        return sticky;
    }

    public String getCreated() {
        return created;
    }

    public String getChanged() {
        return changed;
    }

    public FeedProvider getFeedProvider() {
        return feedProvider;
    }
}
