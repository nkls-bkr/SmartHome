package com.matz.infrastructure.database.adapter;

import com.matz.infrastructure.database.entities.AirDataJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirDataJpaRepository extends JpaRepository<AirDataJpaEntity, Long> {
}
