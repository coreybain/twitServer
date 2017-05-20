package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class Shows {

    //MongoDB id
    @Id
    private String id;

    // Twit show ID
    private int showId;

    // Twit show information
    private String label;
    private String description;
    private String tagline;
    private String showNotes;

    // Twit show acronym
    private String shortCode;

    // Link to Twit website for show
    private String clearPathLink;

    // Twit show is active on network or past show
    private Boolean activeShow;

    // Twit show creation info
    private String created;
    private String showDate;
    private String showContactInfo;

    // Twit show images...
    private HeroImage heroImages;
    private CoverArt coverArt;

    // Twit show video info
    private SdVideoSmallSubscriptionOptions []sdVideoSmallSubscriptionOptions;
    private SdVideoLargeSubscriptionOptions []sdVideoLargeSubscriptionOptions;
    private HdVideoSubscriptionOptions []hdVideoSubscriptionOptions;
    private AudioSubscriptionOptions []audioSubscriptionOptions;


    public void setShow(int showID, String label, String description, String tagline, String showNotes,
                        String shortCode, String clearPathLink, Boolean activeShow, String created,
                        String showDate, String showContactInfo, HeroImage heroImages, CoverArt coverArt,
                        SdVideoSmallSubscriptionOptions []sdVideoSmallSubscriptionOptions, SdVideoLargeSubscriptionOptions
                        []sdVideoLargeSubscriptionOptions, HdVideoSubscriptionOptions []hdVideoSubscriptionOptions,
                        AudioSubscriptionOptions []audioSubscriptionOptions) {

        this.showId = showID;
        this.label = label;
        this.description = description;

        if (tagline != null) {
            this.tagline = tagline;
        }
        if (showNotes != null) {
            this.showNotes = showNotes;
        }
        if (shortCode != null) {
            this.shortCode = shortCode;
        }
        if (clearPathLink != null) {
            this.clearPathLink = clearPathLink;
        }
        if (activeShow != null) {
            this.activeShow = activeShow;
        }
        if (created != null) {
            this.created = created;
        }
        if (showDate != null) {
            this.showDate = showDate;
        }
        if (showContactInfo != null) {
            this.showContactInfo = showContactInfo;
        }
        if (heroImages != null) {
            this.heroImages = heroImages;
        }
        if (coverArt != null) {
            this.coverArt = coverArt;
        }
        if (sdVideoSmallSubscriptionOptions != null) {
            this.sdVideoSmallSubscriptionOptions = sdVideoSmallSubscriptionOptions;
        }
        if (sdVideoLargeSubscriptionOptions != null) {
            this.sdVideoLargeSubscriptionOptions = sdVideoLargeSubscriptionOptions;
        }
        if (hdVideoSubscriptionOptions != null) {
            this.hdVideoSubscriptionOptions = hdVideoSubscriptionOptions;
        }
        if (audioSubscriptionOptions != null) {
            this.audioSubscriptionOptions = audioSubscriptionOptions;
        }
    }

    public String getId() {
        return id;
    }

    public int getShowId() {
        return showId;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public String getTagline() {
        return tagline;
    }

    public String getShowNotes() {
        return showNotes;
    }

    public String getShortCode() {
        return shortCode;
    }

    public String getClearPathLink() {
        return clearPathLink;
    }

    public Boolean getActiveShow() {
        return activeShow;
    }

    public String getCreated() {
        return created;
    }

    public String getShowDate() {
        return showDate;
    }

    public String getShowContactInfo() {
        return showContactInfo;
    }

    public HeroImage getHeroImages() {
        return heroImages;
    }

    public CoverArt getCoverArt() {
        return coverArt;
    }

    public SdVideoSmallSubscriptionOptions[] getSdVideoSmallSubscriptionOptions() {
        return sdVideoSmallSubscriptionOptions;
    }

    public SdVideoLargeSubscriptionOptions[] getSdVideoLargeSubscriptionOptions() {
        return sdVideoLargeSubscriptionOptions;
    }

    public HdVideoSubscriptionOptions[] getHdVideoSubscriptionOptions() {
        return hdVideoSubscriptionOptions;
    }

    public AudioSubscriptionOptions[] getAudioSubscriptionOptions() {
        return audioSubscriptionOptions;
    }
}
