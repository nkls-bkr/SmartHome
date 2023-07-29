package com.smarthome.application.rest.dto.airdata;

import java.time.LocalDateTime;
import java.util.Objects;

public class AirDataDto {
  private final long id;
  private final double temperature;
  private final double humidity;
  private final LocalDateTime localDateTime;

  public AirDataDto(long id, double temperature, double humidity, LocalDateTime localDateTime) {
    this.id = id;
    this.temperature = temperature;
    this.humidity = humidity;
    this.localDateTime = localDateTime;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AirDataDto that = (AirDataDto) o;
    return id == that.id
        && Double.compare(temperature, that.temperature) == 0
        && Double.compare(humidity, that.humidity) == 0
        && Objects.equals(localDateTime, that.localDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, temperature, humidity, localDateTime);
  }
}
