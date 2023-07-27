package com.matz.infrastructure.database.entities.location;

public class LocationJpaEntityDummyData {
    public LocationJpaEntity createLocationJpaEntityDummyData()
    {
        return new LocationJpaEntityBuilder()
                .setId(1)
                .setName("Living room")
                .createLocationJpaEntity();
    }

}
