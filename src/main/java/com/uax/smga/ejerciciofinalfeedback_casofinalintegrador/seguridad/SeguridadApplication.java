package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.uax.smga.ejerciciofinalfeedback_casofinalintegrador"})
public class SeguridadApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeguridadApplication.class, args);
    }
}
