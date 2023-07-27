package com.smarthome.domain.model.location;

public class LocationBuilder{
    private int id;
    private String name;

    public LocationBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public LocationBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Location createLocation() {
        return new Location(id, name);
    }
}