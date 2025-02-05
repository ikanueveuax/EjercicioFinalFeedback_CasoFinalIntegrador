package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.analisis.controller;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.analisis.model.DataRecord;
import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.analisis.service.DataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis")
public class DataAnalysisController {

    @Autowired
    private DataAnalysisService dataAnalysisService;

    @PostMapping("/record")
    public ResponseEntity<DataRecord> addDataRecord(@RequestBody DataRecord record) {
        DataRecord savedRecord = dataAnalysisService.addDataRecord(record);
        return ResponseEntity.ok(savedRecord);
    }

    @GetMapping("/records")
    public ResponseEntity<List<DataRecord>> getAllRecords() {
        return ResponseEntity.ok(dataAnalysisService.getAllDataRecords());
    }

    @GetMapping("/average")
    public ResponseEntity<Double> getAverageValue() {
        return ResponseEntity.ok(dataAnalysisService.calculateAverageValue());
    }
}
