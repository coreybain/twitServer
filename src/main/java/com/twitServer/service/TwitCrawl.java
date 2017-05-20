package com.twitServer.service;

import com.twitServer.async.Callback;
import com.twitServer.async.config.SpringAsyncConfig;
import org.apache.commons.lang.time.DateUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.ExecutionException;

/**
 * Created by Corey Baines on 20/05/2017.
 */
public class TwitCrawl {

    static final long DAY = 24 * 60 * 60 * 1000;
    static final long APIWait = 15 * 1000;

    public boolean apiWait24Hours(Date aDate) {
        return aDate.getTime() > System.currentTimeMillis() - DAY;
    }

    public boolean validAPIWait(Date aDate) {
        System.out.println(aDate.getTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(APIWait);
        return aDate.getTime() > System.currentTimeMillis() - APIWait;
    }


    public void startServer() {

        //Scan mongoDB and see if there has been any changes
        validAPIWait(new Date());



    }
    public void startTwitAPICrawl(String baseURL, int showID, int pageNumber) throws IOException, JSONException, InterruptedException, ExecutionException {

        String coreURL = "https://twit.tv/api/v1.0/" + baseURL;

        if (baseURL == "shows") {
            if (showID > 0) {
                coreURL += "/" + showID;
            }
        } else {
            if (pageNumber > 0) {
                coreURL += "?page=" + pageNumber;
            }
            if (pageNumber > 0 && showID > 0) {
                coreURL += "&filter%5Bshows%5D=" + showID;
            }
        }

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAsyncConfig.class);
        TwitAPI twitAPI = context.getBean(TwitAPI.class);

        twitAPI.readFromTwitAPI(coreURL, new Callback() {
            @Override
            public void twitAPICallback(String key, JSONArray code) {
                ShowsMongo showsMongo = new ShowsMongo();
                showsMongo.updateShows(key, code);
            }
        });
    }



}
