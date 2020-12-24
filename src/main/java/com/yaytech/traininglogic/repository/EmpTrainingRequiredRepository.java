package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.EmpTrainingRequired;
import com.yaytech.traininglogic.model.PositionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpTrainingRequiredRepository extends JpaRepository<EmpTrainingRequired, PositionId> {
}
