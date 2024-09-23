package com.smart;

import com.smart.BankAccountRepository;
import com.smart.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @PostMapping("/registerAccount")
    public String registerAccount(@RequestParam String accountNo,
                                   @RequestParam String accountHolderName) {
        // Create a new BankAccount instance
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNo(accountNo);
        bankAccount.setAccountHolderName(accountHolderName);
        bankAccount.setBalance(0.0); // Initialize balance to 0

        // Save the account to the database
        bankAccountRepository.save(bankAccount);

        return "registrationSuccess"; // Redirect to a success page
    }
}
