package com.anhtd1387.manga.model;

import com.google.gson.Gson;

public class ListType {

    private int id;
    private String name;

    public ListType() {
    }

    public ListType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toJSon() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
