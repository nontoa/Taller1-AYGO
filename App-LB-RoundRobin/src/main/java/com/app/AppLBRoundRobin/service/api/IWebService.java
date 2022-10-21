package com.app.AppLBRoundRobin.service.api;

import com.app.AppLBRoundRobin.dto.WebServiceRequestDto;
import org.springframework.stereotype.Component;

@Component
public interface IWebService {

    public String saveStringContent(final WebServiceRequestDto webServiceDto);

}
