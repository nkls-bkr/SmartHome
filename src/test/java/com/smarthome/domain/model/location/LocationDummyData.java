package com.smarthome.domain.model.location;

public class LocationDummyData {
    public Location createLocationDummyData()
    {
        return new LocationBuilder()
                .setId(1)
                .setName("Living room")
                .createLocation();
    }
}
