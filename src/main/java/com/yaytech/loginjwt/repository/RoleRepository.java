package com.yaytech.loginjwt.repository;

import com.yaytech.loginjwt.model.Role;
import com.yaytech.loginjwt.model.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleEnum name);
}
