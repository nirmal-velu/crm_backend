package com.crm.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.service.Entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
}