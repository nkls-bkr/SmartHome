package com.smarthome.infrastructure.database.mapper.location;

import com.smarthome.domain.model.location.Location;
import com.smarthome.domain.model.location.LocationDummyData;
import com.smarthome.infrastructure.database.entities.location.LocationJpaEntity;
import com.smarthome.infrastructure.database.entities.location.LocationJpaEntityDummyData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LocationJpaEntityMapperImplTest {

  private final LocationJpaEntityMapperImpl locationJpaEntityMapper =
      new LocationJpaEntityMapperImpl();

  private final LocationDummyData locationDummyData = new LocationDummyData();

  private final LocationJpaEntityDummyData locationJpaEntityDummyData =
      new LocationJpaEntityDummyData();

  @Test
  @DisplayName("To jpa entity should return mapped jpa entity")
  void toJpaEntity_shouldReturnLocationJpaEntity() {
    Location locationToMap = locationDummyData.createLocationDummyData();

    LocationJpaEntity expectedLocationJpaEntity =
        locationJpaEntityDummyData.createLocationJpaEntityDummyData();

    LocationJpaEntity actualLocationJpaEntity = locationJpaEntityMapper.toJpaEntity(locationToMap);

    assertThat(actualLocationJpaEntity).isEqualTo(expectedLocationJpaEntity);
  }

  @Test
  @DisplayName("To domain model should return mapped location")
  void toDomainModel_shouldReturnLocation() {
    LocationJpaEntity locationJpaEntityToMap =
        locationJpaEntityDummyData.createLocationJpaEntityDummyData();

    Location expectedLocation = locationDummyData.createLocationDummyData();

    Location actualLocation = locationJpaEntityMapper.toDomainModel(locationJpaEntityToMap);

    assertThat(actualLocation).isEqualTo(expectedLocation);
  }
}
