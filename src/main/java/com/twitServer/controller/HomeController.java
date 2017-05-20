package com.twitServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Corey Baines on 17/05/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String main(Model model) {

        model.addAttribute("twitCode", "Hello corey");
        return "home";
    }
//    public String home(Model model) {
//
//
//        InitServer initTwitCrawl = new InitServer();
//
//        String code = initTwitCrawl.getJSON("https://twit.tv/api/v1.0/shows");
//        ShowParse showParse = new Gson().fromJson(code, ShowParse.class);
//
//        System.out.println(showParse);
//        System.out.println(showParse.getLabel());
//
//        model.addAttribute("twitCode", showParse.getLabel());
//        return "home";
//    }
}
