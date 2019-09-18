package com.org.csse.construction;

import com.org.csse.construction.data.DataServer;
import com.org.csse.construction.data.datastores.TaskDataStore;
import com.org.csse.construction.data.datastores.UserDatastore;
import com.org.csse.construction.dataaccessinterface.TaskRepo;
import com.org.csse.construction.dataaccessinterface.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConstructionApplication implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Autowired
    TaskRepo taskRepo;

    public static void main(String[] args) {
        SpringApplication.run(ConstructionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserDatastore.getSharedInstance().setDataStore(userRepo.findAll());
        TaskDataStore.getSharedInstance().setDataStore(taskRepo.findAll());
    }


}
