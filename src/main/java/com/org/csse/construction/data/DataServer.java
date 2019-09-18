package com.org.csse.construction.data;

import com.org.csse.construction.data.datastores.AbstractDatastore;
import com.org.csse.construction.data.datastores.UserDatastore;
import com.org.csse.construction.dataaccessinterface.UserRepo;
import com.org.csse.construction.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *This class will load all the db data and create cache tables
 *
 */
@Service
public class DataServer {

    private static DataServer self;

    @Autowired
    UserRepo userRepo;
    public static DataServer getSharedInstance() {
        if (self == null) {
            self = new DataServer();
        }
        return self;
    }

    public User getUser(String key) {
        return UserDatastore.getSharedInstance().getUserFromStore(key);
    }

    public void startDataServer() {
        UserDatastore.getSharedInstance().setDataStore(userRepo.findAll());
    }
}
