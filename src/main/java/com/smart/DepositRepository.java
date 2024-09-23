package com.smart;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.model.Deposit;

public interface DepositRepository extends JpaRepository<Deposit, Long> {
}

