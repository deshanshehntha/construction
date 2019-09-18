package com.org.csse.construction.data.datastores;

import com.org.csse.construction.model.Task;
import com.sun.javafx.tk.Toolkit;

import java.util.List;

public class TaskDataStore extends AbstractDatastore {

    private static TaskDataStore self;

    public static TaskDataStore getSharedInstance() {
        if (self == null) {
            self = new TaskDataStore();
        }
        return self;
    }
    @Override
    public void setDataStore(List list) {
        List<Task> taskArrayList = (List<Task>) list;
        for (Task task : taskArrayList) {
            dataStore.put(task.getAssigneeName(),task);
        }
    }

    @Override
    public Task getUserFromStore(String key) {
        return (Task) dataStore.get(key);
    }
}
