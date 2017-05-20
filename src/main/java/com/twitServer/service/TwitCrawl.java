package com.twitServer.service;

import com.twitServer.async.Callback;
import com.twitServer.async.config.SpringAsyncConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Created by Corey Baines on 20/05/2017.
 */
public class TwitCrawl {



    //    @Override
//    public void twitAPICallback(String key, JSONArray code) {
//        System.out.println("HELLO FROM INSIDE THE CALLBACK");
//
//        ShowsMongo showsMongo = new ShowsMongo();
//        showsMongo.updateShows(key, code);
//    }


    public void startServer() throws IOException, JSONException, InterruptedException, ExecutionException {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAsyncConfig.class);
        TwitAPI twitAPI = context.getBean(TwitAPI.class);
        System.out.println("THIS IS BEFORE");
        twitAPI.readFromTwitAPI("https://twit.tv/api/v1.0/Shows", new Callback() {
            @Override
            public void twitAPICallback(String key, JSONArray code) {
                System.out.println(key);
            }
        });

        System.out.println("THIS IS JUST AFTER");
//            if (twitCode.isDone()) {
//                if (twitCode.get().getJSONArray("shows") != null) {
//                    callback.twitAPICallback("shows", twitCode.get().getJSONArray("shows")); //updateShows("shows", twitCode.get().getJSONArray("shows"));
//                }
//            }
//
//        System.out.println("THIS IS AFTER THE WHILE");
    }
//    public void startTwitAPICrawl(String baseURL, int showID, int pageNumber) throws IOException, JSONException, InterruptedException, ExecutionException {
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAsyncConfig.class);
//        TwitAPI twitAPI = context.getBean(TwitAPI.class);
//
//        twitAPI.readFromTwitAPI();
//    }



}
