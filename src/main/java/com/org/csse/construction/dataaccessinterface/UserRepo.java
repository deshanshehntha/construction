package com.org.csse.construction.dataaccessinterface;


import com.org.csse.construction.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepo extends MongoRepository<User, String> {

    List<User> findAll();
}
