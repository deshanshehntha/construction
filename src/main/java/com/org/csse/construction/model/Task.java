package com.org.csse.construction.model;

import com.org.csse.construction.data.datastores.DatabaseEvent;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "task")

public class Task implements DatabaseEvent {



    @Id
    private String _id;
    private String fileName;
    private String assigneeName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }


    @Override
    public String getAllData() {
        return null;
    }

    @Override
    public void setDataStore() {

    }
}
