package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {

    @Bean
    public Logger logger() {
        // Se crea un logger global para el sistema
        return LoggerFactory.getLogger("IntegratedSystemLogger");
    }
}
