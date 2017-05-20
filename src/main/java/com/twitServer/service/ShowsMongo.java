package com.twitServer.service;

import com.twitServer.async.Callback;
import com.twitServer.model.AudioSubscriptionOptions;
import com.twitServer.model.FeedProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Corey Baines on 20/05/2017.
 */
public class ShowsMongo {

    public Boolean updateShows(String key, JSONArray code) {

        for(int i=0;i<=code.length()-1;i++) {
            System.out.println("Server update beginning: --> number " + (i+1) + " out of " + code.length() + " --> show ID: " + code.getJSONObject(i).get("id") + " with the title: " + code.getJSONObject(i).get("label"));

            // For loop for AudioSubscriptionOptions
            if (!code.getJSONObject(i).isNull("audioSubscriptionOptions")) {

                System.out.println(code.getJSONObject(i).getJSONArray("audioSubscriptionOptions").length());
                for(int a=0;a<=(code.getJSONObject(i).getJSONArray("audioSubscriptionOptions").length()-1);a++) {

                    JSONObject audioCode = code.getJSONObject(i).getJSONArray("audioSubscriptionOptions").getJSONObject(a);

                    int percentage = Math.round((a+1) * 100f / (code.getJSONObject(i).getJSONArray("audioSubscriptionOptions").length()));
                    System.out.println("Updating: " + code.getJSONObject(i).get("label") + " --> Audio links: " + audioCode.get("label") + " ----> " + percentage + "%");

                    AudioSubscriptionOptions audioSub = new AudioSubscriptionOptions();
                    FeedProvider feed = new FeedProvider();

                    if (!audioCode.isNull("id")) {
                        audioSub.setAudioId(Integer.parseInt(audioCode.get("id").toString()));
                    }
                    if (!audioCode.isNull("label")) {
                        audioSub.setLabel(audioCode.get("label").toString());
                    }
                    if (!audioCode.isNull("url")) {
                        audioSub.setUrl(audioCode.get("url").toString());
                    }
                    if (!audioCode.isNull("type")){
                        audioSub.setType(audioCode.get("type").toString());
                    }
                    if (!audioCode.isNull("created")) {
                        audioSub.setCreated(audioCode.get("created").toString());
                    }
                    if (!audioCode.isNull("changed")) {
                        audioSub.setCreated(audioCode.get("changed").toString());
                    }
                    if (!audioCode.isNull("feedProvider")) {
                        if (!audioCode.getJSONObject("feedProvider").isNull("id")) {
                            feed.setFeedProvider(Integer.parseInt(audioCode.getJSONObject("feedProvider").get("id").toString()), audioCode.getJSONObject("feedProvider").get("label").toString(), Boolean.parseBoolean(audioCode.getJSONObject("feedProvider").get("active").toString()));
                        }
                    }
                }
            }

            // For loop for SdVideoSmallSubscriptionOptions
            if (!code.getJSONObject(i).isNull("sdVideoSmallSubscriptionOptions")) {

                // For loop for AudioSubscriptionOptions
                System.out.println(code.getJSONObject(i).getJSONArray("sdVideoSmallSubscriptionOptions").length());
                for(int a=0;a<=(code.getJSONObject(i).getJSONArray("sdVideoSmallSubscriptionOptions").length()-1);a++) {

                    JSONObject sdSmallVideoCode = code.getJSONObject(i).getJSONArray("sdVideoSmallSubscriptionOptions").getJSONObject(a);

                    int percentage = Math.round((a+1) * 100f / (code.getJSONObject(i).getJSONArray("sdVideoSmallSubscriptionOptions").length()));
                    System.out.println("Updating: " + code.getJSONObject(i).get("label") + " --> SD Small Video links: " + sdSmallVideoCode.get("label") + " ----> " + percentage + "%");

                    AudioSubscriptionOptions audioSub = new AudioSubscriptionOptions();
                    FeedProvider feed = new FeedProvider();

                    if (!sdSmallVideoCode.isNull("id")) {
                        audioSub.setAudioId(Integer.parseInt(sdSmallVideoCode.get("id").toString()));
                    }
                    if (!sdSmallVideoCode.isNull("label")) {
                        audioSub.setLabel(sdSmallVideoCode.get("label").toString());
                    }
                    if (!sdSmallVideoCode.isNull("url")) {
                        audioSub.setUrl(sdSmallVideoCode.get("url").toString());
                    }
                    if (!sdSmallVideoCode.isNull("type")){
                        audioSub.setType(sdSmallVideoCode.get("type").toString());
                    }
                    if (!sdSmallVideoCode.isNull("created")) {
                        audioSub.setCreated(sdSmallVideoCode.get("created").toString());
                    }
                    if (!sdSmallVideoCode.isNull("changed")) {
                        audioSub.setCreated(sdSmallVideoCode.get("changed").toString());
                    }
                    if (!sdSmallVideoCode.isNull("feedProvider")) {
                        if (!sdSmallVideoCode.getJSONObject("feedProvider").isNull("id")) {
                            feed.setFeedProvider(Integer.parseInt(sdSmallVideoCode.getJSONObject("feedProvider").get("id").toString()), sdSmallVideoCode.getJSONObject("feedProvider").get("label").toString(), Boolean.parseBoolean(sdSmallVideoCode.getJSONObject("feedProvider").get("active").toString()));
                        }
                    }
                }
            }


//            AudioSubscriptionOptions audioSub = new AudioSubscriptionOptions();
//            for(int a=0;a<=(code.getJSONObject(i).getJSONArray("audioSubscriptionOptions").length());a++) {
//
//            }
//            audioSub.setAudioSubscriptionOptions();
//
//            Shows shows = new Shows();


        }

        return true;
    }

}
