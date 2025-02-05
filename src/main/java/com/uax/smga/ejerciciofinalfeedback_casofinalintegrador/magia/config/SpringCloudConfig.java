package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.magia.config;

import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public Customizer<CircuitBreakerFactory> defaultCustomizer() {
        return factory -> {
            // Configuración predeterminada del Circuit Breaker
        };
    }
}
