package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.jurassic.controller;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.jurassic.model.SensorData;
import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.jurassic.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/sensors")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @PostMapping
    public void pushSensorData(@RequestBody SensorData data) {
        sensorService.publishSensorData(data);
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<SensorData> streamSensorData() {
        return sensorService.getSensorDataStream();
    }
}
