package edu.greenriver.sdev.fitnesstracker.controller;

import edu.greenriver.sdev.fitnesstracker.domain.FitnessRecord;
import edu.greenriver.sdev.fitnesstracker.service.FitnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fitness")
public class FitnessController {
    private FitnessService service;

    public FitnessController(FitnessService service) {
        this.service = service;
    }

    @GetMapping("/records")
    public ResponseEntity<List<FitnessRecord>> getAllRecords() {
        List<FitnessRecord> records = service.getAllRecords();
        return new ResponseEntity<>(records, HttpStatus.OK);
    }

    @GetMapping("/records/{id}")
    public ResponseEntity<FitnessRecord> getRecordById(@PathVariable Long id) {
        FitnessRecord record = service.getRecordById(id);
        if (record != null) {
            return new ResponseEntity<>(record, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/records")
    public ResponseEntity<FitnessRecord> createRecord(@RequestBody FitnessRecord record) {
        FitnessRecord createdRecord = service.createRecord(record);
        return new ResponseEntity<>(createdRecord, HttpStatus.CREATED);
    }

    @PutMapping("/records/{id}")
    public ResponseEntity<FitnessRecord> updateRecord(@PathVariable Long id, @RequestBody FitnessRecord record) {
        FitnessRecord updatedRecord = service.updateRecord(id, record);
        if (updatedRecord != null) {
            return new ResponseEntity<>(updatedRecord, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/records/{id}")
    public ResponseEntity<Void> deleteRecord(@PathVariable Long id) {
        service.deleteRecord(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}