package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class CoverArtDerivatives {

    // MongoDB Id
    @Id
    private String id;

    // Derivative information
    private String thumbnail;
    private String twit_album_art_70x70;
    private String twit_album_art_144x144;
    private String twit_album_art_240x240;
    private String twit_album_art_300x300;
    private String twit_album_art_600x600;
    private String twit_album_art_1400x1400;
    private String twit_album_art_2048x2048;

    public void setCoverArtDerivatives(String thumbnail, String twit_album_art_70x70,
                               String twit_album_art_144x144, String twit_album_art_240x240,
                               String twit_album_art_300x300, String twit_album_art_600x600,
                               String twit_album_art_1400x1400, String twit_album_art_2048x2048) {

        if (thumbnail != null) {
            this.thumbnail = thumbnail;
        }
        if (twit_album_art_70x70 != null) {
            this.twit_album_art_70x70 = twit_album_art_70x70;
        }
        if (twit_album_art_144x144 != null) {
            this.twit_album_art_144x144 = twit_album_art_144x144;
        }
        if (twit_album_art_240x240 != null) {
            this.twit_album_art_240x240 = twit_album_art_240x240;
        }
        if (twit_album_art_300x300 != null) {
            this.twit_album_art_300x300 = twit_album_art_300x300;
        }
        if (twit_album_art_600x600 != null) {
            this.twit_album_art_600x600 = twit_album_art_600x600;
        }
        if (twit_album_art_1400x1400 != null) {
            this.twit_album_art_1400x1400 = twit_album_art_1400x1400;
        }
        if (twit_album_art_2048x2048 != null) {
            this.twit_album_art_2048x2048 = twit_album_art_2048x2048;
        }
    }

    public String getId() {
        return id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTwit_album_art_70x70() {
        return twit_album_art_70x70;
    }

    public String getTwit_album_art_144x144() {
        return twit_album_art_144x144;
    }

    public String getTwit_album_art_240x240() {
        return twit_album_art_240x240;
    }

    public String getTwit_album_art_300x300() {
        return twit_album_art_300x300;
    }

    public String getTwit_album_art_600x600() {
        return twit_album_art_600x600;
    }

    public String getTwit_album_art_1400x1400() {
        return twit_album_art_1400x1400;
    }

    public String getTwit_album_art_2048x2048() {
        return twit_album_art_2048x2048;
    }
}
