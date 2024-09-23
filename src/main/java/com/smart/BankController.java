package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.model.AppUser;
import com.smart.model.Bank;
import com.smart.model.Branch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.smart.model.Notification;


@Controller
public class BankController {

    private final Bank bank;
    
    
    public BankController() {
    	
        List<Branch> branches = Arrays.asList(
                new Branch("AVS Compound, 80 Feet Rd, Bangalore"),
                new Branch("KH Plaza, Kanakapura Rd, Bangalore"),
                new Branch("No 117, Some Address, Bangalore"),
                new Branch("965, 12th Cross Rd, Bangalore"),
                new Branch("24th Main Rd, Bangalore"),
                new Branch("HAL, HAL Airport Rd, Bangalore"),
                new Branch("31, SLV Residency 1st Main, Bangalore"),
                new Branch("MV Jayaram Rd, Bangalore"),
                new Branch("No 49, Charu Enclave 17th Cross, Bangalore"),
                new Branch("Yolee Mall, 14, Pottery Rd, Bangalore")
        );

        List<String> services = Arrays.asList(
        		"Online Banking",
                "Savings Account",
                "Fixed Deposit",
                "Credit Card",
                "Withdrawal Form",
                "Current Account",
                "Home Loan",
                "Debit Card",
                "Personal Loan",
                "Education Loan"
                
               
        );

        this.bank = new Bank("State Bank Of India", branches, services);
    }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("bank", bank);
        System.out.println("hi");
        return "home";
    }


    @GetMapping("/branches")
    public String getBranches(Model model) {
        model.addAttribute("bank", bank);
        System.out.println("hi");
        System.out.println(bank.getName());
        bank.getBranches().forEach(branch -> System.out.println(branch.getName()));

        return "branches";
    }

    @GetMapping("/services")
    public String getServices(Model model) {
        model.addAttribute("bank", bank);
        return "services";
    }
    @GetMapping("/serviceForm/{serviceName}")
    public String getServiceForm(@PathVariable String serviceName, Model model) {
        model.addAttribute("serviceName", serviceName);
        return "serviceForm"; // This points to the "serviceForm.html" template
    }
    @GetMapping("/currentForm/{serviceName}")
    public String getCurrentForm(@PathVariable String serviceName, Model model) {
        model.addAttribute("serviceName", serviceName);
        return "currentForm"; // This points to the "serviceForm.html" template
    }
    @GetMapping("/personalLoan")
   public String getPersonalLoan(Model model) {
//        model.addAttribute("serviceName", serviceName);
       return "personalLoan"; // This points to the "serviceForm.html" template
    }
    @GetMapping("/homeLoan")
    public String getHomeLoan(Model model) {
//         model.addAttribute("serviceName", serviceName);
        return "homeLoan"; // This points to the "serviceForm.html" template
     }
    
    @GetMapping("/educationLoan")
    public String getEducationLoan(Model model) {
//         model.addAttribute("serviceName", serviceName);
        return "educationLoan"; // This points to the "serviceForm.html" template
     }
    @GetMapping("/submitA")
    public String SectionA(Model model) {
       // model.addAttribute("personalLoan", new PersonalLoan());
        return "EducationSectionA"; // Thymeleaf template for Section B
    }
    @GetMapping("/creditCard")
    public String getcreditCard(Model model) {
//         model.addAttribute("serviceName", serviceName);
        return "creditCard"; // This points to the "serviceForm.html" template
     }
    @GetMapping("/debitCard")
    public String getDebitCard(Model model) {
//         model.addAttribute("serviceName", serviceName);
        return "debitCard"; // This points to the "serviceForm.html" template
     }
    @GetMapping("/fixedDeposit")
    public String getFixedDeposit(Model model) {
//         model.addAttribute("serviceName", serviceName);
        return "fixedDeposit"; // This points to the "serviceForm.html" template
     }
    @GetMapping("/withdrawl")
    public String getWithdrawl(Model model) {
//         model.addAttribute("serviceName", serviceName);
        return "withdrawl"; // This points to the "serviceForm.html" template
     }
    @GetMapping("/AccountRegister")
    public String getregisterAccount(Model model) {
//         model.addAttribute("serviceName", serviceName);
        return "AccountRegister"; // This points to the "serviceForm.html" template
     }
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("appUser", new AppUser());
        return "login";
    }
    @PostMapping("/login")
    public String loginUser(@ModelAttribute AppUser appUser, Model model) {
        // Add login authentication logic here (e.g., database check)
        model.addAttribute("message", "Login successful");
        return "success"; // Redirect to user dashboard after successful login
    }


    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("appUser", new AppUser());
        return "registration";
    }
//
//    // Handle registration submission
    @PostMapping("/register")
    public String registerUser(AppUser appUser, Model model) {
        // Add user registration logic here
        model.addAttribute("message", "Registration successful!");
        return "login"; // Redirect to login page after registration
    }

    @GetMapping("/sectionA")
    public String showSectionA(Model model) {
       // model.addAttribute("personalLoan", new PersonalLoan());
        return "sectionA"; // Thymeleaf template for Section B
    }
    @GetMapping("/sectionB")
    public String showSectionB(Model model) {
       // model.addAttribute("personalLoan", new PersonalLoan());
        return "sectionB"; // Thymeleaf template for Section B
    }
    @GetMapping("/sectionC")
    public String showSectionC(Model model) {
       // model.addAttribute("personalLoan", new PersonalLoan());
        return "sectionC"; // Thymeleaf template for Section B
    }
    
}