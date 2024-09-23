package com.smart;

//import dao.ServiceFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.ServiceFormRepository;
import com.smart.model.ServiceForm;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @Autowired
    private ServiceFormRepository serviceFormRepository;

    @PostMapping("/submit")
    public String submitForm(
    						@RequestParam String name, 
                             @RequestParam String fatherName,
                             @RequestParam String gender,
                             @RequestParam String nationality,
                             @RequestParam String motherName,
                             @RequestParam String maritalStatus,
                             @RequestParam String aadhaarNumber,
                             @RequestParam String parentAadhaar,
                             @RequestParam String address,
                             @RequestParam String city,
                             @RequestParam String pin,
                             @RequestParam String state,
                             @RequestParam String phone,
                             @RequestParam String mobile,
                             @RequestParam String permAddress,
                             @RequestParam String permCity,
                             @RequestParam String permPin,
                             @RequestParam String permState,
                             @RequestParam String fax,
                             @RequestParam String email,
                             @RequestParam String income,
                             @RequestParam String religion,
                             @RequestParam String category,
                             @RequestParam String educationQualification,
                             @RequestParam String modeOfOperation,
                             Model model
                             
    							) {

        // Create a new ServiceForm object and populate it with just two fields
        ServiceForm user = new ServiceForm();
        user.setName(name);
        user.setFatherName(fatherName);
        user.setGender(gender);
        user.setNationalities(nationality);
        user.setMotherName(motherName);
        user.setMaritalStatus(maritalStatus);
        user.setAadhaarNumber(aadhaarNumber);
        user.setParentAadhaar(parentAadhaar);
        user.setAddress(address);
        user.setCity(city);
        user.setPin(pin);
        user.setState(state);
        user.setPhone(phone);
        user.setMobile(mobile);
        user.setPermAddress(permAddress);
        user.setPermCity(permCity);
        user.setPermPin(permPin);
        user.setPermState(permState);
        user.setFax(fax);
        user.setEmail(email);
        user.setIncome(income);
        user.setReligion(religion);
        user.setCategory(category);
        user.setEducationQualification(educationQualification);
        user.setModeOfOperation(modeOfOperation);

        // Save the ServiceForm object to the database
        serviceFormRepository.save(user);
        model.addAttribute("message", "Your account has been opened in SBI");
        // Return the success page or view
        return "success";
    }
}
