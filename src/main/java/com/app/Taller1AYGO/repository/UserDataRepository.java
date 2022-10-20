package com.app.Taller1AYGO.repository;

import com.app.Taller1AYGO.model.UserData;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserDataRepository extends MongoRepository<UserData, String> {

    @Aggregation(pipeline = {
            "{ '$sort' : { 'creationDate' : -1 } }",
            "{ '$limit' : ?0 }"
    })
    List<UserData> findRecords(int limit);
}
