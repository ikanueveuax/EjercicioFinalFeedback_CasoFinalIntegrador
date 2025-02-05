package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    private final Logger logger = LoggerFactory.getLogger(SecurityAspect.class);

    @After("execution(* com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.seguridad.controller.*.*(..))")
    public void logSecurityEvent(JoinPoint joinPoint) {
        logger.info("Se ejecutó el método de seguridad: {}", joinPoint.getSignature().getName());
        // Aquí se pueden implementar validaciones o registros adicionales.
    }
}
