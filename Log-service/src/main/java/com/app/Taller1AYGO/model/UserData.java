package com.app.Taller1AYGO.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("userData")
public class UserData {

    @Id
    private String id;
    private String stringContent;
    private Date creationDate;

}
