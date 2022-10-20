package com.app.Taller1AYGO.controller;

import com.app.Taller1AYGO.constant.RestEndpoint;
import com.app.Taller1AYGO.dto.UserDataDto;
import com.app.Taller1AYGO.model.UserData;
import com.app.Taller1AYGO.service.api.IAppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(RestEndpoint.STRING_CONTENT)
public class AppController {

    private IAppService appService;

    public AppController(IAppService appService){

        this.appService = appService;
    }

    @PostMapping
    public ResponseEntity<List<UserData>> saveUserData(@Validated @RequestBody UserDataDto userDataDto){

        return new ResponseEntity<>(appService.saveUserData(userDataDto.getStringContent()), HttpStatus.OK);
    }


}
