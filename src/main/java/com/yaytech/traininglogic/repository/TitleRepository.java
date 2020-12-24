package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, Long> {
}
