package com.app.AppLBRoundRobin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WebServiceResponseDto {

    private String id;
    private String stringContent;
    private Date creationDate;
}
