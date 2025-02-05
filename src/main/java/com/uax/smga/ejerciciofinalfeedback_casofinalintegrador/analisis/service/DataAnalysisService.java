package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.analisis.service;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.analisis.model.DataRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataAnalysisService {

    private List<DataRecord> dataRecords = new ArrayList<>();

    public DataRecord addDataRecord(DataRecord record) {
        record.setTimestamp(System.currentTimeMillis());
        dataRecords.add(record);
        return record;
    }

    public List<DataRecord> getAllDataRecords() {
        return dataRecords;
    }

    public Double calculateAverageValue() {
        if(dataRecords.isEmpty()){
            return 0.0;
        }
        double sum = dataRecords.stream().mapToDouble(DataRecord::getValue).sum();
        return sum / dataRecords.size();
    }
}
