package com.smart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.model.EducationLoan;

@Controller

public class EducationLoanController {

    @Autowired
    private EducationLoanRepository educationLoanRepository;

    @PostMapping("/submitLoan")
    public String submitForm(
        @RequestParam String applicationNo,
        @RequestParam String applicationDate,
        @RequestParam String branchCode,
        @RequestParam String branchName,
        @RequestParam String referralGroup,
        @RequestParam String existingBorrower,
        @RequestParam String sourcingEntityType,
        @RequestParam String sourceCode,
        @RequestParam String sourceOfficerCode,
        @RequestParam String sourcingOfficerName,
        @RequestParam String losId,
        @RequestParam String lmsOcasId,
        @RequestParam String processingFeeCollected,
        @RequestParam String stampDutyCollected,
        @RequestParam String sbiLifeSold,
        @RequestParam String sbiLoanInsuranceSold
    ) {
       EducationLoan user = new EducationLoan();
        user.setApplicationNo(applicationNo);
        user.setApplicationDate(applicationDate);
        user.setBranchCode(branchCode);
        user.setBranchName(branchName);
        user.setReferralGroup(referralGroup);
        user.setExistingBorrower(existingBorrower);
        user.setSourcingEntityType(sourcingEntityType);
        user.setSourceCode(sourceCode);
        user.setSourceOfficerCode(sourceOfficerCode);
        user.setSourcingOfficerName(sourcingOfficerName);
        user.setLosId(losId);
        user.setLmsOcasId(lmsOcasId);
        user.setProcessingFeeCollected(processingFeeCollected);
        user.setStampDutyCollected(stampDutyCollected);
        user.setSbiLifeSold(sbiLifeSold);
        user.setSbiLoanInsuranceSold(sbiLoanInsuranceSold);

        educationLoanRepository.save(user);

        return "EducationSectionA"; // Navigate to Section A
    }

    @PostMapping("/submitA")
    public String submitFormA(
        @RequestParam String name,
        @RequestParam String salutation,
        @RequestParam String dob,
		 @RequestParam String maritalStatus,
		 @RequestParam String spouseName,
		 @RequestParam String dependentsCount,
		 @RequestParam String childrenCount,
		 @RequestParam String fatherHusbandName,
		 @RequestParam String mothersMaidenName,
		 @RequestParam String nationality,
		 @RequestParam String residentialStatus,
		 @RequestParam String category,
		 @RequestParam String religion,
		 @RequestParam String placeOfBirth,
		 @RequestParam String disabilityType,
		 @RequestParam String education,
		 @RequestParam String license,
		 @RequestParam String driving,
		 @RequestParam String passport,
		 @RequestParam String valid,
		 @RequestParam String pan,
		 @RequestParam String voter,
		 @RequestParam String aadhaar,
		 @RequestParam String house,
		 @RequestParam String presentAddress,
		 	@RequestParam String years,
		 	@RequestParam String months,
		 	@RequestParam String proof,
		 	@RequestParam String residental,
		 	@RequestParam String DATE,
		 	@RequestParam String apartment,
		 	@RequestParam String street,
		 	@RequestParam String area,
		 	@RequestParam String marks,
		 	@RequestParam String city,
		 	@RequestParam String district,
		 	@RequestParam String pincode,
		 	@RequestParam String state,
		 	@RequestParam String country,
		 	@RequestParam String tel,
		 	@RequestParam String mobile,
		 	@RequestParam String email,
		 	@RequestParam String permAddress,
		 	@RequestParam String choose,
		 	@RequestParam String flat,
		 	@RequestParam String streets,
		 	@RequestParam String location,
//		 	@RequestParam String landMark,
////		 	@RequestParam String cityy,
////		 	@RequestParam String districtt,
////		 	@RequestParam String pinCode
//		 	@RequestParam String sTates,
////		 	@RequestParam String countryy,
//		 	@RequestParam String tele,
//		 	@RequestParam String organization,
//		 	@RequestParam String streetName,
//		 	@RequestParam String landmarks,
////		 	@RequestParam String citys,
//		 	@RequestParam String statess,
//		 	@RequestParam String telePh,
////		 	@RequestParam String fax,
//		 	@RequestParam String mobiles,
////		 	@RequestParam String emails,
//		 	@RequestParam String repay,
//		 	@RequestParam String relation,
////		 	@RequestParam String cif,
//		 	@RequestParam String contactName,
////		 	@RequestParam String contactAddress,
//		 	@RequestParam String contactPincode,
////		 	@RequestParam String contactEmail,
		 	@RequestParam String contactMobile
        // Add other parameters as needed
    ) {
        EducationLoan user = new EducationLoan();
        user.setName(name);
        user.setSalutation(salutation);
        user.setDob(dob);
        user.setMaritalStatus(maritalStatus);
        user.setSpouseName(spouseName);
        user.setDependentsCount(dependentsCount);
        user.setChildrenCount(childrenCount);
        user.setFatherHusbandName(fatherHusbandName);
        user.setMothersMaidenName(mothersMaidenName);
        user.setNationality(nationality);
        user.setResidentialStatus(residentialStatus);
        user.setCategory(category);
        user.setReligion(religion);
        user.setPlaceOfBirth(placeOfBirth);
        user.setDisabilityType(disabilityType);
        user.setEducation(education);
        user.setLicense(license);
        user.setDriving(driving);
        user.setPassport(passport);
        user.setValid(valid);
        user.setPan(pan);
        user.setVoter(voter);
        user.setAadhaar(aadhaar);
        user.setHouse(house);
        user.setPresentAddress(presentAddress);
        user.setYears(years);
        user.setMonths(months);
        user.setProof(proof);
        user.setResidental(residental);
        user.setDATE(DATE);
        user.setApartment(apartment);
        user.setStreet(street);
        user.setArea(area);
        user.setMarks(marks);
        user.setCity(city);
        user.setDistrict(district);
        user.setPincode(pincode);
        user.setState(state);
        user.setCountry(country);
        user.setTel(tel);
        user.setMobile(mobile);
        user.setEmail(email);
        user.setPermAddress(permAddress);
        user.setChoose(choose);
        user.setFlat(flat);
        user.setStreets(streets);
        user.setLocation(location);

        educationLoanRepository.save(user);
        
        return "success"; // Navigate to Section B
    }

}
