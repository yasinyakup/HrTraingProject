package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {
}
