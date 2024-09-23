package com.smart;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.model.Withdrawl;

public interface WithdrawlRepository extends JpaRepository<Withdrawl,Long> {

}
