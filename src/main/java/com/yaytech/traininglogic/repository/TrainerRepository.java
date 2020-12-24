package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
