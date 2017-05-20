package com.twitServer.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Corey Baines on 17/05/2017.
 */
public class HeroImage {

    // Mongo id
    @Id
    private int id;

    // Twit hero image id
    private int heroId;

    // Hero image information
    private String url;
    private String fileName;
    private String mimeType;

    // Image file information
    private int fileSize;
    private int width;
    private int height;

    // Image creation information
    private String created;
    private String changed;
    private String status;

    private HeroImageDerivatives heroImageDerivatives;

    public void setHeroImage(int heroId, String url, String fileName, String mimeType, int fileSize,
                             int width, int height, String created, String changed, String status,
                             HeroImageDerivatives heroImageDerivatives) {

        this.heroId = heroId;
        this.url = url;
        this.fileName = fileName;

        if (mimeType != null) {
            this.mimeType = mimeType;
        }
        if (fileSize > 0) {
            this.fileSize = fileSize;
        }
        if (width > 0) {
            this.width = width;
        }
        if (height > 0) {
            this.width = width;
        }
        if (created != null) {
            this.created = created;
        }
        if (changed != null) {
            this.changed = changed;
        }
        if (status != null) {
            this.status = status;
        }
        if (heroImageDerivatives != null) {
            this.heroImageDerivatives = heroImageDerivatives;
        }
    }

    public int getId() {
        return id;
    }

    public int getHeroId() {
        return heroId;
    }

    public String getUrl() {
        return url;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getCreated() {
        return created;
    }

    public String getChanged() {
        return changed;
    }

    public String getStatus() {
        return status;
    }

    public HeroImageDerivatives getHeroImageDerivatives() {
        return heroImageDerivatives;
    }
}
