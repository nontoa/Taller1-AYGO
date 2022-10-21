package com.app.AppLBRoundRobin.service.impl;

import com.app.AppLBRoundRobin.client.LogServiceClient;
import com.app.AppLBRoundRobin.dto.WebServiceRequestDto;
import com.app.AppLBRoundRobin.service.api.IWebService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.URI;

@Slf4j
@Service
public class WebService implements IWebService {

    private LogServiceClient logServiceClient;

    public WebService(LogServiceClient logServiceClient){

        this.logServiceClient = logServiceClient;
    }

    @Override
    public String saveStringContent(WebServiceRequestDto webServiceDto) {

        var lbServer = ServerManager.getServer();
        var server = new StringBuilder("http://")
                .append(lbServer)
                .append(":9292");
        log.info("Request is gonna be processed in {} container", lbServer);
        URI logServiceContainerName = URI.create(server.toString());
        var response = logServiceClient.saveUserData(logServiceContainerName, webServiceDto);
        return new Gson().toJson(response);
    }

}
