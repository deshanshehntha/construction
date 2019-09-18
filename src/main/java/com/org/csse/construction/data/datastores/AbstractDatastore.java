package com.org.csse.construction.data.datastores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class AbstractDatastore <T extends DatabaseEvent> {

    protected Map<String, Map<String, T>> dataStore = new HashMap<>();

    public abstract void setDataStore(List list);

    public abstract T getUserFromStore(String key);


}
