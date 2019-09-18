package com.org.csse.construction.dataaccessinterface;

import com.org.csse.construction.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepo extends MongoRepository<Task, String> {

    public List<Task> findAll();
}