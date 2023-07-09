package com.containertest.demo.airdata.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
@Builder

@Entity
public class AirDataEntity {

    @Id
    @GeneratedValue
    private long id;
    private double temperature;
    private double humidity;
    private LocalDateTime localDateTime;
}
