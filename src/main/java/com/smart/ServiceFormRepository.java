package com.smart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.model.ServiceForm;

@Repository
public interface ServiceFormRepository extends JpaRepository<ServiceForm, Long> {
}

