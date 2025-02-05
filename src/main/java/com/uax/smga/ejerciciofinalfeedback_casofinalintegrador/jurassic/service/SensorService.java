package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.jurassic.service;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.jurassic.model.SensorData;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;

@Service
public class SensorService {

    // Se utiliza un Sink para emitir datos a los clientes suscritos.
    private final Sinks.Many<SensorData> sink = Sinks.many().multicast().onBackpressureBuffer();

    @PostConstruct
    public void init() {
        // Aquí se podría iniciar la emisión periódica de datos simulados.
    }

    public void publishSensorData(SensorData data) {
        data.setTimestamp(LocalDateTime.now());
        sink.tryEmitNext(data);
    }

    public Flux<SensorData> getSensorDataStream() {
        return sink.asFlux();
    }
}
