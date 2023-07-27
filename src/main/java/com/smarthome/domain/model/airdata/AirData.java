package com.smarthome.domain.model.airdata;

import java.time.LocalDateTime;

public class AirData {
  private final double temperature;
  private final double humidity;
  private final LocalDateTime localDateTime;

  public AirData(double temperature, double humidity, LocalDateTime localDateTime) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.localDateTime = localDateTime;
  }
}
