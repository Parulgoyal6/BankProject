package com.smart;

import com.smart.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    BankAccount findByAccountNo(String accountNo);
}
