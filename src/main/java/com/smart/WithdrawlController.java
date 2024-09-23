package com.smart;

import com.smart.BankAccountRepository;
import com.smart.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WithdrawlController {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @PostMapping("/submitWithdrawal")
    public String withdrawMoney(@RequestParam("accountNo") String accountNo,
                                @RequestParam("amount") double amount,
                                Model model) {
        // Fetch the account by account number
        BankAccount bankAccount = bankAccountRepository.findByAccountNo(accountNo);
        
        // Check if account exists
        if (bankAccount == null) {
            model.addAttribute("error", "Account not found!");
            return "withdrawl";
        }

        // Check if sufficient balance is available
        if (bankAccount.getBalance() < amount) {
            model.addAttribute("error", "Insufficient balance!");
            return "withdrawl";
        }

        // Deduct the amount
        double newBalance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(newBalance);

        // Save the updated account information
        bankAccountRepository.save(bankAccount);

        model.addAttribute("message", "Withdrawal successful! New balance: " + newBalance);
        return "withdrawlsuccess";
    }
}
