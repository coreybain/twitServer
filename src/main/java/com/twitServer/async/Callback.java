package com.twitServer.async;

import org.json.JSONArray;

/**
 * Created by Corey Baines on 20/05/2017.
 */
public interface Callback {

    void twitAPICallback(String key, JSONArray code);

}