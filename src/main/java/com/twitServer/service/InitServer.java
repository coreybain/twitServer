package com.twitServer.service;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

/**
 * Created by Corey Baines on 17/05/2017.
 */

public class InitServer {


    public void init() throws IOException, JSONException, ExecutionException, InterruptedException {

        System.out.println("Welcome -- The system has started please wait for a verified connection through the TWiT API");
        TwitCrawl twitCrawl = new TwitCrawl();
        twitCrawl.startServer();

    }

}
