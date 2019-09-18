package com.org.csse.construction.service;

import com.org.csse.construction.util.RequestConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ServiceHandler {

    @Autowired
    UserService userService;

    public ResponseEntity handleServiceRequest(String reqId) {
        switch (Integer.parseInt(reqId)) {
            case RequestConstants.GET_USER_REQUEST : return getRequiredUser();
            default: return new ResponseEntity("Failed", HttpStatus.OK);
        }
    }

    private ResponseEntity getRequiredUser() {
        return userService.getRequiredUser();
    }

}
