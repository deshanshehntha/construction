package com.org.csse.construction.data.datastores;

import com.org.csse.construction.dataaccessinterface.UserRepo;
import com.org.csse.construction.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDatastore extends AbstractDatastore {

    private static UserDatastore self;

    @Autowired
    UserRepo userRepo;

    public static UserDatastore getSharedInstance() {
        if (self == null) {
            self = new UserDatastore();
        }
        return self;
    }

    @Override
    public void setDataStore(List list) {
        List<User> userArrayList = (List<User>) list;
        for (User user : userArrayList) {
            dataStore.put(user.getEmail(),user);
        }
    }

    @Override
    public User getUserFromStore(String key) {
        return (User) dataStore.get(key);
    }
}
