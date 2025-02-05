package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.analisis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sensorId;
    private Double value;
    private Long timestamp;

    // Constructores
    public DataRecord() { }

    public DataRecord(String sensorId, Double value, Long timestamp) {
        this.sensorId = sensorId;
        this.value = value;
        this.timestamp = timestamp;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
}
