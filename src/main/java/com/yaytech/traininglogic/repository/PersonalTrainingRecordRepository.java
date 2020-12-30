package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.Employee;
import com.yaytech.traininglogic.model.PersonalTrainingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalTrainingRecordRepository extends JpaRepository<PersonalTrainingRecord, Long> {
    public List<PersonalTrainingRecord> findPersonalTrainingRecordByEmployee(Employee employee);
}
