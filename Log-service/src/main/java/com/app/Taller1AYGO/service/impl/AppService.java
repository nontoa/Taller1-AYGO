package com.app.Taller1AYGO.service.impl;

import com.app.Taller1AYGO.model.UserData;
import com.app.Taller1AYGO.repository.UserDataRepository;
import com.app.Taller1AYGO.service.api.IAppService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class AppService implements IAppService {

    private UserDataRepository userDataRepository;

    public AppService(UserDataRepository userDataRepository){

        this.userDataRepository = userDataRepository;
    }

    @Override
    public List<UserData> saveUserData(String data){

        var userData = UserData
                .builder()
                .stringContent(data)
                .creationDate(new Date(System.currentTimeMillis()))
                .build();
        userDataRepository.save(userData);
        return userDataRepository.findRecords(10);
    }

}
