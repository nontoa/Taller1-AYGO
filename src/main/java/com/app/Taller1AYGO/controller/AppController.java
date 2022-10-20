package com.app.Taller1AYGO.controller;

import com.app.Taller1AYGO.constant.RestEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestEndpoint.EXAMPLE_ENDPOINT)
public class AppController {

    @GetMapping
    public String getSampleResponse(){

        return ("Hello Docker!");
    }


}
