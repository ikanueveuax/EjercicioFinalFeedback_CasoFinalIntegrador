package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.job;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.model.SensorData;
import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.marte.processor.SensorDataProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SensorDataJobConfig {

    @Bean
    public Job sensorDataJob(JobBuilderFactory jobBuilderFactory, Step sensorDataStep) {
        return jobBuilderFactory.get("sensorDataJob")
                .start(sensorDataStep)
                .build();
    }

    @Bean
    public Step sensorDataStep(StepBuilderFactory stepBuilderFactory,
                               ItemReader<SensorData> sensorDataReader,
                               ItemProcessor<SensorData, SensorData> sensorDataProcessor,
                               ItemWriter<SensorData> sensorDataWriter) {
        return stepBuilderFactory.get("sensorDataStep")
                .<SensorData, SensorData>chunk(10)
                .reader(sensorDataReader)
                .processor(sensorDataProcessor)
                .writer(sensorDataWriter)
                .build();
    }

    // Implementación simple para demostrar el flujo:

    @Bean
    public ItemReader<SensorData> sensorDataReader() {
        return new ItemReader<SensorData>() {
            private boolean read = false;
            @Override
            public SensorData read() {
                if (!read) {
                    read = true;
                    // Retorna un dato simulado. En una aplicación real se leerían datos desde una fuente.
                    return new SensorData("sensor-1", 42.0, System.currentTimeMillis());
                }
                return null;
            }
        };
    }

    @Bean
    public ItemWriter<SensorData> sensorDataWriter() {
        return items -> items.forEach(item -> System.out.println("SensorData procesado: " + item));
    }
}
