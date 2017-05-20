package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class HeroImageDerivatives {

    // MongoDB Id
    @Id
    private String id;

    // Derivative information
    private String thumbnail;
    private String twit_slideshow_1600x400;
    private String twit_slideshow_1200x300;
    private String twit_slideshow_800x200;
    private String twit_slideshow_600x450;
    private String twit_slideshow_400x300;

    public void setHeroImageDerivatives(String thumbnail, String twit_slideshow_1600x400,
                                String twit_slideshow_1200x300, String twit_slideshow_800x200,
                                String twit_slideshow_600x450, String twit_slideshow_400x300) {
        if (thumbnail != null) {
            this.thumbnail = thumbnail;
        }
        if (twit_slideshow_1600x400 != null) {
            this.twit_slideshow_1600x400 = twit_slideshow_1600x400;
        }
        if (twit_slideshow_1200x300 != null) {
            this.twit_slideshow_1200x300 = twit_slideshow_1200x300;
        }
        if (twit_slideshow_800x200 != null) {
            this.twit_slideshow_800x200 = twit_slideshow_800x200;
        }
        if (twit_slideshow_600x450 != null) {
            this.twit_slideshow_600x450 = twit_slideshow_600x450;
        }
        if (twit_slideshow_400x300 != null) {
            this.twit_slideshow_400x300 = twit_slideshow_400x300;
        }
    }

    public String getId() {
        return id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTwit_slideshow_1600x400() {
        return twit_slideshow_1600x400;
    }

    public String getTwit_slideshow_1200x300() {
        return twit_slideshow_1200x300;
    }

    public String getTwit_slideshow_800x200() {
        return twit_slideshow_800x200;
    }

    public String getTwit_slideshow_600x450() {
        return twit_slideshow_600x450;
    }

    public String getTwit_slideshow_400x300() {
        return twit_slideshow_400x300;
    }
}
