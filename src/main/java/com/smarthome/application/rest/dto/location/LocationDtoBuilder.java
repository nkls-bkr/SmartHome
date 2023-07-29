package com.smarthome.application.rest.dto.location;

public class LocationDtoBuilder {
    private int id;
    private String name;

    public LocationDtoBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public LocationDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public LocationDto createLocationDto() {
        return new LocationDto(id, name);
    }
}