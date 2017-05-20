package com.twitServer.async.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by Corey Baines on 19/05/2017.
 */

@EnableAsync
@Configuration
@ComponentScan("com.twitServer")
public class SpringAsyncConfig  {

}
