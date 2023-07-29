package com.smarthome.infrastructure.database.adapter;

import com.smarthome.infrastructure.database.entities.airdata.AirDataJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirDataJpaRepository extends JpaRepository<AirDataJpaEntity, Long> {
}
