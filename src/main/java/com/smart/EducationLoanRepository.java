package com.smart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.model.EducationLoan;

@Repository
public interface EducationLoanRepository extends JpaRepository<EducationLoan, Long> {
}

