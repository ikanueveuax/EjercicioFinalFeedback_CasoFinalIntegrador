package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad.service;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad.model.SecurityEvent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityService {

    // Se simula el almacenamiento en memoria para propósitos de demostración.
    private List<SecurityEvent> events = new ArrayList<>();

    public SecurityEvent logEvent(SecurityEvent event) {
        event.setTimestamp(System.currentTimeMillis());
        events.add(event);
        return event;
    }

    public List<SecurityEvent> getAllEvents() {
        return events;
    }
}
