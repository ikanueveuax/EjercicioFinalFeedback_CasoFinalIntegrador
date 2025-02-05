package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad.controller;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad.model.SecurityEvent;
import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @PostMapping("/log")
    public ResponseEntity<SecurityEvent> logSecurityEvent(@RequestBody SecurityEvent event) {
        SecurityEvent loggedEvent = securityService.logEvent(event);
        return ResponseEntity.ok(loggedEvent);
    }

    @GetMapping("/events")
    public ResponseEntity<List<SecurityEvent>> getAllEvents() {
        return ResponseEntity.ok(securityService.getAllEvents());
    }
}
