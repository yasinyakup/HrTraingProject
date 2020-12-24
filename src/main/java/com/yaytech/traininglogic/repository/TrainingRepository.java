package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Long> {
}
