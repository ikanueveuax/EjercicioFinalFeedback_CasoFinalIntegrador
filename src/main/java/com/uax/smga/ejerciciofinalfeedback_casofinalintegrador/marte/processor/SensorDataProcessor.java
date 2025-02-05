package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.processor;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.model.SensorData;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class SensorDataProcessor implements ItemProcessor<SensorData, SensorData> {
    @Override
    public SensorData process(SensorData item) throws Exception {
        // Validación o transformación del dato.
        if (item.getValue() == null) {
            throw new Exception("SensorData inválido: valor nulo");
        }
        // Ejemplo: se puede ajustar el valor o filtrar datos.
        return item;
    }
}
