package com.smart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.model.PersonalLoan;

@Repository
public interface PersonalLoanRepository extends JpaRepository<PersonalLoan, Long> {
}


