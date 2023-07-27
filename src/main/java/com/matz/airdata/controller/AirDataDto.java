package com.matz.airdata.controller;

import java.time.LocalDateTime;

public class AirDataDto {
    private final double temperature;
    private final double humidity;
    private final LocalDateTime localDateTime;

    public AirDataDto(Builder builder) {
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
        this.localDateTime = builder.localDateTime;
    }

    public static Builder builder() {
        return new Builder();
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

    public static final class Builder {
        private double temperature;
        private double humidity;
        private LocalDateTime localDateTime;

        public Builder() {
        }

        public Builder withTemperature(double temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder withHumidity(double humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder atTime(LocalDateTime localDateTime) {
            this.localDateTime = localDateTime;
            return this;
        }

        public AirDataDto build() {
            return new AirDataDto(this);
        }
    }
}