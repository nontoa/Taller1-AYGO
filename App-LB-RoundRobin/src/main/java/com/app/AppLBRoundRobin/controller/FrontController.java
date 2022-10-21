package com.app.AppLBRoundRobin.controller;

import com.app.AppLBRoundRobin.dto.WebServiceRequestDto;
import com.app.AppLBRoundRobin.service.api.IWebService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FrontController {

    IWebService webService;

    public FrontController(IWebService webService){

        this.webService = webService;
    }

    @GetMapping("/web-service")
    public String greetingForm(Model model) {

        model.addAttribute("webServiceDto", new WebServiceRequestDto());
        return "webService";
    }

    @PostMapping("/web-service")
    public String greetingSubmit(@ModelAttribute WebServiceRequestDto webServiceDto, Model model) {

        final var response = webService.saveStringContent(webServiceDto);
        model.addAttribute("json_response", response);
        return "result";
    }

}
