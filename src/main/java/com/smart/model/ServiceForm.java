package com.smart.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
//import javax.persistence.*;

@Entity
public class ServiceForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fatherName;

    private LocalDate dob;
    private String gender;
    private String nationality;
    private String motherName;
    private String maritalStatus;
    private String aadhaarNumber;
    private String parentAadhaar;
    private String address;
    private String city;
    private String pin;
    private String state;
    private String phone;
    private String mobile;
    private String permAddress;
    private String permCity;
    private String permPin;
    private String permState;
    private String fax;
    private String email;
    private String income;
    private String assets;
    private String religion;
    private String category;
    private String educationQualification;
    private String modeOfOperation;
    private byte[] photoUpload;
    private byte[] signatureUpload;
    // Getters and setters...
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    
   

	public String getNationality() {
		return nationality;
	}

	public void setNationalities(String nationality) {
		this.nationality = nationality;
	}
	
//
//	public LocalDate getDob() {
//		return dob;
//	}
//
//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}
//
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getParentAadhaar() {
		return parentAadhaar;
	}

	public void setParentAadhaar(String parentAadhaar) {
		this.parentAadhaar = parentAadhaar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(String permAddress) {
		this.permAddress = permAddress;
	}

	public String getPermCity() {
		return permCity;
	}

	public void setPermCity(String permCity) {
		this.permCity = permCity;
	}

	public String getPermPin() {
		return permPin;
	}

	public void setPermPin(String permPin) {
		this.permPin = permPin;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPermState() {
		return permState;
	}

	public void setPermState(String permState) {
		this.permState = permState;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getAssets() {
		return assets;
	}

	public void setAssets(String assets) {
		this.assets = assets;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEducationQualification() {
		return educationQualification;
	}

	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}

	public String getModeOfOperation() {
		return modeOfOperation;
	}

	public void setModeOfOperation(String modeOfOperation) {
		this.modeOfOperation = modeOfOperation;
	}

	public byte[] getPhotoUpload() {
		return photoUpload;
	}

	public void setPhotoUpload(byte[] photoUpload) {
		this.photoUpload = photoUpload;
	}

	public byte[] getSignatureUpload() {
		return signatureUpload;
	}

	public void setSignatureUpload(byte[] signatureUpload) {
		this.signatureUpload = signatureUpload;
	}

	
	
}
