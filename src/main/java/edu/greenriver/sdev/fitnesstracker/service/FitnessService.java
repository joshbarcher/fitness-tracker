package edu.greenriver.sdev.fitnesstracker.service;

import edu.greenriver.sdev.fitnesstracker.domain.FitnessRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FitnessService {
    private List<FitnessRecord> records = new ArrayList<>();

    public List<FitnessRecord> getAllRecords() {
        return records;
    }

    public FitnessRecord getRecordById(Long id) {
        return records.stream()
                .filter(record -> record.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public FitnessRecord createRecord(FitnessRecord record) {
        record.setId((long) (records.size() + 1));
        records.add(record);
        return record;
    }

    public FitnessRecord updateRecord(Long id, FitnessRecord record) {
        FitnessRecord existingRecord = getRecordById(id);
        if (existingRecord != null) {
            existingRecord.setActivity(record.getActivity());
            existingRecord.setDuration(record.getDuration());
            existingRecord.setDate(record.getDate());
            return existingRecord;
        }
        return null;
    }

    public void deleteRecord(Long id) {
        records.removeIf(record -> record.getId().equals(id));
    }
}