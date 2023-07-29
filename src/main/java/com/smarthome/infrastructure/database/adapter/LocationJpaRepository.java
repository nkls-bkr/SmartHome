package com.smarthome.infrastructure.database.adapter;

import com.smarthome.infrastructure.database.entities.location.LocationJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationJpaRepository extends JpaRepository<LocationJpaEntity, Long> {
}
