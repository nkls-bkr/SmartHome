package com.matz.infrastructure.database.adapter;

import com.matz.infrastructure.database.entities.location.LocationJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationJpaRepository extends JpaRepository<LocationJpaEntity, Integer> {
}
