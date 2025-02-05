package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.repository;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.model.SensorData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends CrudRepository<SensorData, Long> {
    // Métodos de consulta adicionales si se requiere.
}
