package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.jurassic.model;

import java.time.LocalDateTime;

public class SensorData {
    private String sensorId;
    private Double value;
    private LocalDateTime timestamp;

    public SensorData() { }

    public SensorData(String sensorId, Double value, LocalDateTime timestamp) {
        this.sensorId = sensorId;
        this.value = value;
        this.timestamp = timestamp;
    }

    // Getters y Setters
    public String getSensorId() {
        return sensorId;
    }
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
