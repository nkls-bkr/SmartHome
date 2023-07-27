package com.smarthome.infrastructure.database.entities.location;

public class LocationJpaEntityBuilder {
    private int id;
    private String name;

    public LocationJpaEntityBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public LocationJpaEntityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public LocationJpaEntity createLocationJpaEntity() {
        return new LocationJpaEntity(id, name);
    }
}