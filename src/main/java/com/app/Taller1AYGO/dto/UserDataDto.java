package com.app.Taller1AYGO.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDataDto {

    @NonNull
    private String stringContent;
}
