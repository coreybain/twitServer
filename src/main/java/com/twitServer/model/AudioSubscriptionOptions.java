package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class AudioSubscriptionOptions {

    @Id
    private String id;

    // Audio id
    private int audioId;

    // Audio information
    private String label;
    private String url;
    private String type;
    private String sticky;

    // Twit show creation info
    private String created;
    private String changed;

    private FeedProvider feedProvider;

    public void setAudioSubscriptionOptions(int audioId, String label, String url, String type, String sticky,
                                    String created, String changed, FeedProvider feedProvider) {
        this.audioId = audioId;
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

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSticky(String sticky) {
        this.sticky = sticky;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public void setFeedProvider(FeedProvider feedProvider) {
        this.feedProvider = feedProvider;
    }

    public String getId() {
        return id;
    }

    public int getAudioId() {
        return audioId;
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
