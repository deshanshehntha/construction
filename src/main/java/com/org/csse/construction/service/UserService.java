package com.org.csse.construction.service;

import com.org.csse.construction.data.datastores.UserDatastore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public ResponseEntity getRequiredUser() {
        return new ResponseEntity(UserDatastore.getSharedInstance().getUserFromStore("chamika@gmail.com"), HttpStatus.OK);
    }

}
