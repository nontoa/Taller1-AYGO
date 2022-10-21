package com.app.AppLBRoundRobin.client;

import com.app.AppLBRoundRobin.dto.WebServiceRequestDto;
import com.app.AppLBRoundRobin.dto.WebServiceResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.util.List;

@FeignClient(name = "logService", url = "localhost:9292")
public interface LogServiceClient {

    @PostMapping(value = "/string")
    List<WebServiceResponseDto> saveUserData(URI baseUrl, @RequestBody WebServiceRequestDto webServiceRequestDto);

}
