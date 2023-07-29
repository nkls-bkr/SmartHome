package com.smarthome.infrastructure.database.entities.airdata;

import com.smarthome.infrastructure.database.entities.location.LocationJpaEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "AirData")
public class AirDataJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double temperature;
    private double humidity;
    private LocalDateTime timestamp;

    @ManyToOne
    private LocationJpaEntity locationJpaEntity;

    public AirDataJpaEntity() {
    }

    public AirDataJpaEntity(long id,
                            double temperature,
                            double humidity,
                            LocalDateTime localDateTime, LocationJpaEntity locationJpaEntity) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.timestamp = localDateTime;
        this.locationJpaEntity = locationJpaEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public LocationJpaEntity getLocationJpaEntity() {
        return locationJpaEntity;
    }

    public void setLocationJpaEntity(LocationJpaEntity locationJpaEntity) {
        this.locationJpaEntity = locationJpaEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirDataJpaEntity that = (AirDataJpaEntity) o;
        return id == that.id && Double.compare(temperature, that.temperature) == 0 && Double.compare(humidity, that.humidity) == 0 && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, temperature, humidity, timestamp);
    }
}
