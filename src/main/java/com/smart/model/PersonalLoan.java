package com.smart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class PersonalLoan {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String applicationNo;
	 	private String applicationDate;
	 	private String branchCode;
	 	private String branchName;
	 	private String referralGroup;
	 	private String existingBorrower;
	 	private String sourcingEntityType;
	 	private String sourceCode;
	 	private String sourceOfficerCode;
	 	private String sourcingOfficerName;
	 	private String losId;
	 	private String lmsOcasId;
	 	private String processingFeeCollected;
	 	private String stampDutyCollected;
	 	private String sbiLifeSold;
	 	private String sbiLoanInsuranceSold;
	 	
	 	/********************Section A************************/
	 	private String name;
	 	private String salutation;
	 	private String dob;
	 	private String maritalStatus;
	 	private String spouseName;
	 	private String dependentsCount;
	 	private String childrenCount;
	 	private String fatherHusbandName;
	 	private String mothersMaidenName;
	 	private String nationality;
	 	private String residentialStatus;
	 	private String category;
	 	private String religion;
	 	private String placeOfBirth;
	 	private String disabilityType;
	 	private String education;
	 	private String license;
	 	private String driving;
	 	private String passport;
	 	private String valid;
	 	private String pan;
	 	private String voter;
	 	private String aadhaar;
	 	private String house;
	 	private String presentAddress;
	 	private String years;
	 	private String months;
	 	private String proof;
	 	private String residental;
	 	private String DATE;
	 	private String apartment;
	 	private String street;
	 	private String area;
	 	private String marks;
	 	private String city;
	 	private String district;
	 	private String pincode;
	 	private String state;
	 	private String country;
	 	private String tel;
	 	private String mobile;
	 	private String email;
	 	private String permAddress;
	 	private String choose;
	 	private String flat;
	 	private String streets;
	 	private String location;
//	 	private String landMark;
////	 	private String cityy;
////	 	private String districtt;
////	 	private String pinCode;
//	 	private String sTates;
////	 	private String countryy;
//	 	private String tele;
//	 	private String organization;
//	 	private String streetName;
//	 	private String landmarks;
////	 	private String citys;
//	 	private String statess;
//	 	private String telePh;
////	 	private String fax;
//	 	private String mobiles;
////	 	private String emails;
//	 	private String repay;
//	 	private String relation;
////	 	private String cif;
//	 	private String contactName;
////	 	private String contactAddress;
//	 	private String contactPincode;
////	 	private String contactEmail;
//	 	private String contactMobile;
	 	
	 	/********************Section B*******************/
	// 	private String occupationType;
//	 	private String employerName;
//	 	private String totalExperienceYears;
//	 	private String totalExperienceMonths;
//	 	private String presentJobYears;
//	 	private String presentJobMonths;
//	 	private String previousEmployerName;
//	 	private String previousEmployerContact;
//	 	private String previousEmployerAddress;
//	 	private String currentIndustry;
//	 	private String ddoAddress;
	 //	private String organizationType;
//	 	private String department;
//	 	private String employeeNumber;
//	 	private String defenceType;
//	 	private String personalForceNumber;
//	 	private String regimentName;
//	 	private String incomeHead1;
//	// 	private String grossAmount1;
//	 	private String netAmount1;
//	 	private String periodicity1;
//	 	private String model1;
//	 	private String incomeHead2;
////	 	private String grossAmount2;
//	 	private String netAmount2;
//	 	private String periodicity2;
//	 	private String model2;
//	 	private String incomeHead3;
////	 	private String grossAmount3;
//	 	private String netAmount3;
//	 	private String periodicity3;
//	 	private String model3;
//	 	private String applicantName;
//	 	private String incomeDate;
	 	
	 	/****************Sction C************/
//	 	private String schemeName;
//	 	private String netMonthlyIncome;
//	 	private String proposedEMI;
//	 	private String emiNmiRatio;
//	 	private String loanAmount;
//	 	private String tenureMonths;
//	 	private String rateOfInterest;
//	 	private String checkOff;
//	 	private String salaryPackages;
//	 	private String loanPurpose;
//	 	private String processingFees;
//	 	private String concessionsPercentage;
//	 	private String concessionProcessingFee;
	 	
	 	/************Section D*******************/
//	 	private String insuranceCover;
//	 	private String insuranceCover;
//	 	private String premiumPaymentOption;
//	 	private String premiumPaymentOption;
	 	
	 	/****************Section E*********************/
//	 	private String applicantSignature;
//	 	private String place;
//	 	private String date;

	 	
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getApplicationNo() {
			return applicationNo;
		}
		public void setApplicationNo(String applicationNo) {
			this.applicationNo = applicationNo;
		}
		public String getApplicationDate() {
			return applicationDate;
		}
		public void setApplicationDate(String applicationDate) {
			this.applicationDate = applicationDate;
		}
		public String getBranchCode() {
			return branchCode;
		}
		public void setBranchCode(String branchCode) {
			this.branchCode = branchCode;
		}
		public String getBranchName() {
			return branchName;
		}
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		public String getReferralGroup() {
			return referralGroup;
		}
		public void setReferralGroup(String referralGroup) {
			this.referralGroup = referralGroup;
		}
		public String getExistingBorrower() {
			return existingBorrower;
		}
		public void setExistingBorrower(String existingBorrower) {
			this.existingBorrower = existingBorrower;
		}
		public String getSourcingEntityType() {
			return sourcingEntityType;
		}
		public void setSourcingEntityType(String sourcingEntityType) {
			this.sourcingEntityType = sourcingEntityType;
		}
		public String getSourceCode() {
			return sourceCode;
		}
		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}
		public String getSourceOfficerCode() {
			return sourceOfficerCode;
		}
		public void setSourceOfficerCode(String sourceOfficerCode) {
			this.sourceOfficerCode = sourceOfficerCode;
		}
		public String getSourcingOfficerName() {
			return sourcingOfficerName;
		}
		public void setSourcingOfficerName(String sourcingOfficerName) {
			this.sourcingOfficerName = sourcingOfficerName;
		}
		public String getLosId() {
			return losId;
		}
		public void setLosId(String losId) {
			this.losId = losId;
		}
		public String getLmsOcasId() {
			return lmsOcasId;
		}
		public void setLmsOcasId(String lmsOcasId) {
			this.lmsOcasId = lmsOcasId;
		}
		public String getProcessingFeeCollected() {
			return processingFeeCollected;
		}
		public void setProcessingFeeCollected(String processingFeeCollected) {
			this.processingFeeCollected = processingFeeCollected;
		}
		public String getStampDutyCollected() {
			return stampDutyCollected;
		}
		public void setStampDutyCollected(String stampDutyCollected) {
			this.stampDutyCollected = stampDutyCollected;
		}
		public String getSbiLifeSold() {
			return sbiLifeSold;
		}
		public void setSbiLifeSold(String sbiLifeSold) {
			this.sbiLifeSold = sbiLifeSold;
		}
		public String getSbiLoanInsuranceSold() {
			return sbiLoanInsuranceSold;
		}
		public void setSbiLoanInsuranceSold(String sbiLoanInsuranceSold) {
			this.sbiLoanInsuranceSold = sbiLoanInsuranceSold;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSalutation() {
			return salutation;
		}
		public void setSalutation(String salutation) {
			this.salutation = salutation;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public String getSpouseName() {
			return spouseName;
		}
		public void setSpouseName(String spouseName) {
			this.spouseName = spouseName;
		}
		public String getDependentsCount() {
			return dependentsCount;
		}
		public void setDependentsCount(String dependentsCount) {
			this.dependentsCount = dependentsCount;
		}
		public String getChildrenCount() {
			return childrenCount;
		}
		public void setChildrenCount(String childrenCount) {
			this.childrenCount = childrenCount;
		}
		public String getFatherHusbandName() {
			return fatherHusbandName;
		}
		public void setFatherHusbandName(String fatherHusbandName) {
			this.fatherHusbandName = fatherHusbandName;
		}
		public String getMothersMaidenName() {
			return mothersMaidenName;
		}
		public void setMothersMaidenName(String mothersMaidenName) {
			this.mothersMaidenName = mothersMaidenName;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getResidentialStatus() {
			return residentialStatus;
		}
		public void setResidentialStatus(String residentialStatus) {
			this.residentialStatus = residentialStatus;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getReligion() {
			return religion;
		}
		public void setReligion(String religion) {
			this.religion = religion;
		}
		public String getPlaceOfBirth() {
			return placeOfBirth;
		}
		public void setPlaceOfBirth(String placeOfBirth) {
			this.placeOfBirth = placeOfBirth;
		}
		public String getDisabilityType() {
			return disabilityType;
		}
		public void setDisabilityType(String disabilityType) {
			this.disabilityType = disabilityType;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public String getLicense() {
			return license;
		}
		public void setLicense(String license) {
			this.license = license;
		}
		public String getDriving() {
			return driving;
		}
		public void setDriving(String driving) {
			this.driving = driving;
		}
		public String getPassport() {
			return passport;
		}
		public void setPassport(String passport) {
			this.passport = passport;
		}
		public String getValid() {
			return valid;
		}
		public void setValid(String valid) {
			this.valid = valid;
		}
		public String getPan() {
			return pan;
		}
		public void setPan(String pan) {
			this.pan = pan;
		}
		public String getVoter() {
			return voter;
		}
		public void setVoter(String voter) {
			this.voter = voter;
		}
		public String getAadhaar() {
			return aadhaar;
		}
		public void setAadhaar(String aadhaar) {
			this.aadhaar = aadhaar;
		}
		public String getHouse() {
			return house;
		}
		public void setHouse(String house) {
			this.house = house;
		}
		public String getPresentAddress() {
			return presentAddress;
		}
		public void setPresentAddress(String presentAddress) {
			this.presentAddress = presentAddress;
		}
		public String getYears() {
			return years;
		}
		public void setYears(String years) {
			this.years = years;
		}
		public String getMonths() {
			return months;
		}
		public void setMonths(String months) {
			this.months = months;
		}
		public String getProof() {
			return proof;
		}
		public void setProof(String proof) {
			this.proof = proof;
		}
		public String getResidental() {
			return residental;
		}
		public void setResidental(String residental) {
			this.residental = residental;
		}
		public String getDATE() {
			return DATE;
		}
		public void setDATE(String dATE) {
			DATE = dATE;
		}
		public String getApartment() {
			return apartment;
		}
		public void setApartment(String apartment) {
			this.apartment = apartment;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getMarks() {
			return marks;
		}
		public void setMarks(String marks) {
			this.marks = marks;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPermAddress() {
			return permAddress;
		}
		public void setPermAddress(String permAddress) {
			this.permAddress = permAddress;
		}
		public String getChoose() {
			return choose;
		}
		public void setChoose(String choose) {
			this.choose = choose;
		}
		public String getFlat() {
			return flat;
		}
		public void setFlat(String flat) {
			this.flat = flat;
		}
		public String getStreets() {
			return streets;
		}
		public void setStreets(String streets) {
			this.streets = streets;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
//		public String getLandMark() {
//			return landMark;
//		}
//		public void setLandMark(String landMark) {
//			this.landMark = landMark;
//		}
////		public String getCityy() {
////			return cityy;
////		}
////		public void setCityy(String cityy) {
////			this.cityy = cityy;
//////		}
////		public String getDistrictt() {
////			return districtt;
////		}
////		public void setDistrictt(String districtt) {
////			this.districtt = districtt;
////		}
////		public String getPinCode() {
////			return pinCode;
////		}
////		public void setPinCode(String pinCode) {
////			this.pinCode = pinCode;
////		}
//		public String getsTates() {
//			return sTates;
//		}
//		public void setsTates(String sTates) {
//			this.sTates = sTates;
//		}
////		public String getCountryy() {
////			return countryy;
////		}
////		public void setCountryy(String countryy) {
////			this.countryy = countryy;
////		}
//		public String getTele() {
//			return tele;
//		}
//		public void setTele(String tele) {
//			this.tele = tele;
//		}
//		public String getOrganization() {
//			return organization;
//		}
//		public void setOrganization(String organization) {
//			this.organization = organization;
//		}
//		public String getStreetName() {
//			return streetName;
//		}
//		public void setStreetName(String streetName) {
//			this.streetName = streetName;
//		}
//		public String getLandmarks() {
//			return landmarks;
//		}
//		public void setLandmarks(String landmarks) {
//			this.landmarks = landmarks;
//		}
////		public String getCitys() {
////			return citys;
////		}
////		public void setCitys(String citys) {
////			this.citys = citys;
////		}
//		public String getStatess() {
//			return statess;
//		}
//		public void setStatess(String statess) {
//			this.statess = statess;
//		}
//		public String getTelePh() {
//			return telePh;
//		}
//		public void setTelePh(String telePh) {
//			this.telePh = telePh;
//		}
////		public String getFax() {
////			return fax;
////		}
////		public void setFax(String fax) {
////			this.fax = fax;
////		}
//		public String getMobiles() {
//			return mobiles;
//		}
//		public void setMobiles(String mobiles) {
//			this.mobiles = mobiles;
//		}
////		public String getEmails() {
////			return emails;
////		}
////		public void setEmails(String emails) {
////			this.emails = emails;
////		}
//		public String getRepay() {
//			return repay;
//		}
//		public void setRepay(String repay) {
//			this.repay = repay;
//		}
//		public String getRelation() {
//			return relation;
//		}
//		public void setRelation(String relation) {
//			this.relation = relation;
//		}
////		public String getCif() {
////			return cif;
////		}
////		public void setCif(String cif) {
////			this.cif = cif;
////		}
//		public String getContactName() {
//			return contactName;
//		}
//		public void setContactName(String contactName) {
//			this.contactName = contactName;
//		}
////		public String getContactAddress() {
////			return contactAddress;
////		}
////		public void setContactAddress(String contactAddress) {
////			this.contactAddress = contactAddress;
////		}
//		public String getContactPincode() {
//			return contactPincode;
//		}
//		public void setContactPincode(String contactPincode) {
//			this.contactPincode = contactPincode;
//		}
////		public String getContactEmail() {
////			return contactEmail;
////		}
////		public void setContactEmail(String contactEmail) {
////			this.contactEmail = contactEmail;
////		}
//		public String getContactMobile() {
//			return contactMobile;
//		}
//		public void setContactMobile(String contactMobile) {
//			this.contactMobile = contactMobile;
//		}
		
		/********************* Section C*****************/
//		public String getScheme_Name() {
//			return schemeName;
//		}
//		public void setScheme_Name(String schemeName) {
//			this.schemeName = schemeName;
//		}
//		public String getNetMonthlyIncome() {
//			return netMonthlyIncome;
//		}
//		public void setNetMonthlyIncome(String netMonthlyIncome) {
//			this.netMonthlyIncome = netMonthlyIncome;
//		}
//		public String getProposedEMI() {
//			return proposedEMI;
//		}
//		public void setProposedEMI(String proposedEMI) {
//			this.proposedEMI = proposedEMI;
//		}
//		public String getEmiNmiRatio() {
//			return emiNmiRatio;
//		}
//		public void setEmiNmiRatio(String emiNmiRatio) {
//			this.emiNmiRatio = emiNmiRatio;
//		}
//		public String getLoanAmount() {
//			return loanAmount;
//		}
//		public void setLoanAmount(String loanAmount) {
//			this.loanAmount = loanAmount;
//		}
//		public String getTenureMonths() {
//			return tenureMonths;
//		}
//		public void setTenureMonths(String tenureMonths) {
//			this.tenureMonths = tenureMonths;
//		}
//		public String getRateOfInterest() {
//			return rateOfInterest;
//		}
//		public void setRateOfInterest(String rateOfInterest) {
//			this.rateOfInterest = rateOfInterest;
//		}
//		public String getCheckOff() {
//			return checkOff;
//		}
//		public void setCheckOff(String checkOff) {
//			this.checkOff = checkOff;
//		}
//		public String getSalaryPackages() {
//			return salaryPackages;
//		}
//		public void setSalaryPackages(String salaryPackages) {
//			this.salaryPackages = salaryPackages;
//		}
//		public String getLoanPurpose() {
//			return loanPurpose;
//		}
//		public void setLoanPurpose(String loanPurpose) {
//			this.loanPurpose = loanPurpose;
//		}
//		public String getProcessingFees() {
//			return processingFees;
//		}
//		public void setProcessingFees(String processingFees) {
//			this.processingFees = processingFees;
//		}
//		public String getConcessionsPercentage() {
//			return concessionsPercentage;
//		}
//		public void setConcessionsPercentage(String concessionsPercentage) {
//			this.concessionsPercentage = concessionsPercentage;
//		}
//		public String getConcessionProcessingFee() {
//			return concessionProcessingFee;
//		}
//		public void setConcessionProcessingFee(String concessionProcessingFee) {
//			this.concessionProcessingFee = concessionProcessingFee;
//		}
		
		/*******************Section B**************/
//		
//		public String getOccupationType() {
//			return occupationType;
//		}
//		public void setOccupationType(String occupationType) {
//			this.occupationType = occupationType;
//		}
//		public String getEmployerName() {
//			return employerName;
//		}
//		public void setEmployerName(String employerName) {
//			this.employerName = employerName;
//		}
//		public String getTotalExperienceYears() {
//			return totalExperienceYears;
//		}
//		public void setTotalExperienceYears(String totalExperienceYears) {
//			this.totalExperienceYears = totalExperienceYears;
//		}
//		public String getTotalExperienceMonths() {
//			return totalExperienceMonths;
//		}
//		public void setTotalExperienceMonths(String totalExperienceMonths) {
//			this.totalExperienceMonths = totalExperienceMonths;
//		}
//		public String getPresentJobYears() {
//			return presentJobYears;
//		}
//		public void setPresentJobYears(String presentJobYears) {
//			this.presentJobYears = presentJobYears;
//		}
//		public String getPresentJobMonths() {
//			return presentJobMonths;
//		}
//		public void setPresentJobMonths(String presentJobMonths) {
//			this.presentJobMonths = presentJobMonths;
//		}
//		public String getPreviousEmployerName() {
//			return previousEmployerName;
//		}
//		public void setPreviousEmployerName(String previousEmployerName) {
//			this.previousEmployerName = previousEmployerName;
//		}
//		public String getPreviousEmployerContact() {
//			return previousEmployerContact;
//		}
//		public void setPreviousEmployerContact(String previousEmployerContact) {
//			this.previousEmployerContact = previousEmployerContact;
//		}
//		public String getPreviousEmployerAddress() {
//			return previousEmployerAddress;
//		}
//		public void setPreviousEmployerAddress(String previousEmployerAddress) {
//			this.previousEmployerAddress = previousEmployerAddress;
//		}
//		public String getCurrentIndustry() {
//			return currentIndustry;
//		}
//		public void setCurrentIndustry(String currentIndustry) {
//			this.currentIndustry = currentIndustry;
//		}
//		public String getDdoAddress() {
//			return ddoAddress;
//		}
//		public void setDdoAddress(String ddoAddress) {
//			this.ddoAddress = ddoAddress;
//		}
//		public String getOrganizationType() {
//			return organizationType;
//		}
//		public void setOrganizationType(String organizationType) {
//			this.organizationType = organizationType;
//		}
//		public String getDepartment() {
//			return department;
//		}
//		public void setDepartment(String department) {
//			this.department = department;
//		}
//		public String getEmployeeNumber() {
//			return employeeNumber;
//		}
//		public void setEmployeeNumber(String employeeNumber) {
//			this.employeeNumber = employeeNumber;
//		}
//		public String getDefenceType() {
//			return defenceType;
//		}
//		public void setDefenceType(String defenceType) {
//			this.defenceType = defenceType;
//		}
//		public String getPersonalForceNumber() {
//			return personalForceNumber;
//		}
//		public void setPersonalForceNumber(String personalForceNumber) {
//			this.personalForceNumber = personalForceNumber;
//		}
//		public String getRegimentName() {
//			return regimentName;
//		}
//		public void setRegimentName(String regimentName) {
//			this.regimentName = regimentName;
//		}
//		public String getIncomeHead1() {
//			return incomeHead1;
//		}
//		public void setIncomeHead1(String incomeHead1) {
//			this.incomeHead1 = incomeHead1;
//		}
//		public String getGrossAmount1() {
//			return grossAmount1;
//		}
//		public void setGrossAmount1(String grossAmount1) {
//			this.grossAmount1 = grossAmount1;
//		}
//		public String getNetAmount1() {
//			return netAmount1;
//		}
//		public void setNetAmount1(String netAmount1) {
//			this.netAmount1 = netAmount1;
//		}
//		public String getPeriodicity1() {
//			return periodicity1;
//		}
//		public void setPeriodicity1(String periodicity1) {
//			this.periodicity1 = periodicity1;
//		}
//		public String getModel1() {
//			return model1;
//		}
//		public void setModel1(String model1) {
//			this.model1 = model1;
//		}
//		public String getIncomeHead2() {
//			return incomeHead2;
//		}
//		public void setIncomeHead2(String incomeHead2) {
//			this.incomeHead2 = incomeHead2;
//		}
////		public String getGrossAmount2() {
////			return grossAmount2;
////		}
////		public void setGrossAmount2(String grossAmount2) {
////			this.grossAmount2 = grossAmount2;
////		}
//		public String getNetAmount2() {
//			return netAmount2;
//		}
//		public void setNetAmount2(String netAmount2) {
//			this.netAmount2 = netAmount2;
//		}
//		public String getPeriodicity2() {
//			return periodicity2;
//		}
//		public void setPeriodicity2(String periodicity2) {
//			this.periodicity2 = periodicity2;
//		}
//		public String getModel2() {
//			return model2;
//		}
//		public void setModel2(String model2) {
//			this.model2 = model2;
//		}
//		public String getIncomeHead3() {
//			return incomeHead3;
//		}
//		public void setIncomeHead3(String incomeHead3) {
//			this.incomeHead3 = incomeHead3;
//		}
////		public String getGrossAmount3() {
////			return grossAmount3;
////		}
////		public void setGrossAmount3(String grossAmount3) {
////			this.grossAmount3 = grossAmount3;
////		}
////		public String getNetAmount3() {
////			return netAmount3;
////		}
//		public void setNetAmount3(String netAmount3) {
//			this.netAmount3 = netAmount3;
//		}
//		public String getPeriodicity3() {
//			return periodicity3;
//		}
//		public void setPeriodicity3(String periodicity3) {
//			this.periodicity3 = periodicity3;
//		}
//		public String getModel3() {
//			return model3;
//		}
//		public void setModel3(String model3) {
//			this.model3 = model3;
//		}
//		public String getApplicantName() {
//			return applicantName;
//		}
//		public void setApplicantName(String applicantName) {
//			this.applicantName = applicantName;
//		}
//		public String getIncomeDate() {
//			return incomeDate;
//		}
//		public void setIncomeDate(String incomeDate) {
//			this.incomeDate = incomeDate;
//		}
//	 	
	
		
		
}
