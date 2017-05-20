package com.twitServer.service;

import com.twitServer.async.Callback;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Created by Corey Baines on 19/05/2017.
 */
@Component
public class TwitAPI {

    Callback callback;


    @Async
    public void readFromTwitAPI(String url, Callback callback) throws IOException, JSONException {
        InputStream is = null;
        HttpURLConnection c = null;
        URL u = new URL(url);
        c = (HttpURLConnection) u.openConnection();
        c.setRequestMethod("GET");
        c.setRequestProperty("Content-length", "0");
        c.setRequestProperty("Accept", "application/json");
        c.setRequestProperty("app-id", "3e742ac7");
        c.setRequestProperty("app-key", "2a6557daace8c6524cc82af2e718fbcc");
        c.setUseCaches(false);
        c.setAllowUserInteraction(false);
        c.connect();
        is = c.getInputStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
            String jsonText = sb.toString();
            JSONObject json = new JSONObject(jsonText);
            System.out.println("CALLBACK BEFORE");
            callback.twitAPICallback("shows", json.getJSONArray("shows"));
//            callback = new TwitCrawl();
//            callback.twitAPICallback("shows", json.getJSONArray("shows"));//return new AsyncResult<JSONObject>(json);
        } finally {
            is.close();
            c.disconnect();
        }
    }

}
