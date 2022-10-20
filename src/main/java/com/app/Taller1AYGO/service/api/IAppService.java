package com.app.Taller1AYGO.service.api;

import com.app.Taller1AYGO.model.UserData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IAppService {

    List<UserData> saveUserData(final String data);

}
