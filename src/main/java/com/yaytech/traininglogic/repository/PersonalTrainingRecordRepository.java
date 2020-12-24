package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.PersonalTrainingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalTrainingRecordRepository extends JpaRepository<PersonalTrainingRecord, Long> {
}
