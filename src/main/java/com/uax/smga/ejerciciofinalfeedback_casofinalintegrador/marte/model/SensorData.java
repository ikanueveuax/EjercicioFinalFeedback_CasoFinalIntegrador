package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.model;

public class SensorData {
    private String sensorId;
    private Double value;
    private Long timestamp;

    public SensorData() { }

    public SensorData(String sensorId, Double value, Long timestamp) {
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
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "sensorId='" + sensorId + '\'' +
                ", value=" + value +
                ", timestamp=" + timestamp +
                '}';
    }
}
