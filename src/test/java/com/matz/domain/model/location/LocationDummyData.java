package com.matz.domain.model.location;

public class LocationDummyData {
    public Location createLocationDummyData()
    {
        return new LocationBuilder()
                .setId(1)
                .setName("Living room")
                .createLocation();
    }
}
