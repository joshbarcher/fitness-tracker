package edu.greenriver.sdev.fitnesstracker.bootstrap;

import edu.greenriver.sdev.fitnesstracker.domain.FitnessRecord;
import edu.greenriver.sdev.fitnesstracker.service.FitnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class LoadRecords implements CommandLineRunner {
    private FitnessService service;

    public LoadRecords(FitnessService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        FitnessRecord record1 = new FitnessRecord();
        record1.setActivity("Running");
        record1.setDuration(30);
        record1.setDate(LocalDate.of(2024, 2, 20));
        service.createRecord(record1);

        FitnessRecord record2 = new FitnessRecord();
        record2.setActivity("Cycling");
        record2.setDuration(45);
        record2.setDate(LocalDate.of(2024, 2, 21));
        service.createRecord(record2);

        FitnessRecord record3 = new FitnessRecord();
        record3.setActivity("Swimming");
        record3.setDuration(60);
        record3.setDate(LocalDate.of(2024, 2, 22));
        service.createRecord(record3);

        FitnessRecord record4 = new FitnessRecord();
        record4.setActivity("Yoga");
        record4.setDuration(60);
        record4.setDate(LocalDate.of(2024, 2, 23));
        service.createRecord(record4);

        FitnessRecord record5 = new FitnessRecord();
        record5.setActivity("Weightlifting");
        record5.setDuration(45);
        record5.setDate(LocalDate.of(2024, 2, 24));
        service.createRecord(record5);

        FitnessRecord record6 = new FitnessRecord();
        record6.setActivity("Hiking");
        record6.setDuration(90);
        record6.setDate(LocalDate.of(2024, 2, 25));
        service.createRecord(record6);

        FitnessRecord record7 = new FitnessRecord();
        record7.setActivity("Basketball");
        record7.setDuration(60);
        record7.setDate(LocalDate.of(2024, 2, 26));
        service.createRecord(record7);

        FitnessRecord record8 = new FitnessRecord();
        record8.setActivity("Pilates");
        record8.setDuration(45);
        record8.setDate(LocalDate.of(2024, 2, 27));
        service.createRecord(record8);

        FitnessRecord record9 = new FitnessRecord();
        record9.setActivity("Kickboxing");
        record9.setDuration(60);
        record9.setDate(LocalDate.of(2024, 2, 28));
        service.createRecord(record9);

        FitnessRecord record10 = new FitnessRecord();
        record10.setActivity("Zumba");
        record10.setDuration(45);
        record10.setDate(LocalDate.of(2024, 2, 29));
        service.createRecord(record10);

        FitnessRecord record11 = new FitnessRecord();
        record11.setActivity("Rowing");
        record11.setDuration(30);
        record11.setDate(LocalDate.of(2024, 3, 1));
        service.createRecord(record11);
    }
}