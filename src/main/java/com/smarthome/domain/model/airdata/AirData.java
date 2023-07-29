package com.smarthome.domain.model.airdata;

import com.smarthome.domain.model.location.Location;

import java.time.LocalDateTime;

public class AirData {
  private final long id;
  private final double temperature;
  private final double humidity;
  private final LocalDateTime localDateTime;
    private final Location location;

    public AirData(long id, double temperature, double humidity, LocalDateTime localDateTime, Location location) {
    this.id = id;
    this.temperature = temperature;
    this.humidity = humidity;
    this.localDateTime = localDateTime;
        this.location = location;
  }

  public long getId() {
    return id;
  }

  public double getTemperature() {
    return temperature;
  }

  public double getHumidity() {
    return humidity;
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

    public Location getLocation() {
        return location;
    }
}
