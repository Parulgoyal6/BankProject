package com.smart.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deposit {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String date;
	private String accountNo;
	private String kycFirstHolder;
	private String holderType;
	private String dobFirstHolder;
	private String cifFirstHolder;
	private String titleFirstHolder;
	private String nameFirstHolder;
	private String kycSecondHolder;
	private String dobSecondHolder;
	private String cifSecondHolder;
	private String modeOfOperation;
	private String depositType;
	private String amount;
	private String amountWords;
	private String maturityInstruction;
	private String paymentOption;
	private String modScheme;
	private String Bank;
	private String recurringDeposit;
	private String monthlyInstallment;
	private String amountType;
	private String periodYears;
	private String periodMonths;
	private String standingInstructions;
	private String Number;
	private String debitAccountNo;
//	private MultipartFile accountHolderSignature;
//	private String secondAccountHolderSignature;
	private String nomineeName;
	private String nomineeRelationship;
	private String nomineeAge;
	private String nomineeDob;
	private String nomineeAddress;
	private String nomineeCity;
	private String nomineeState;
	private String nomineeKyc;
	//private String accountDepositorSignature;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getKycFirstHolder() {
		return kycFirstHolder;
	}
	public void setKycFirstHolder(String kycFirstHolder) {
		this.kycFirstHolder = kycFirstHolder;
	}
	public String getHolderType() {
		return holderType;
	}
	public void setHolderType(String holderType) {
		this.holderType = holderType;
	}
	public String getDobFirstHolder() {
		return dobFirstHolder;
	}
	public void setDobFirstHolder(String dobFirstHolder) {
		this.dobFirstHolder = dobFirstHolder;
	}
	public String getCifFirstHolder() {
		return cifFirstHolder;
	}
	public void setCifFirstHolder(String cifFirstHolder) {
		this.cifFirstHolder = cifFirstHolder;
	}
	public String getTitleFirstHolder() {
		return titleFirstHolder;
	}
	public void setTitleFirstHolder(String titleFirstHolder) {
		this.titleFirstHolder = titleFirstHolder;
	}
	public String getNameFirstHolder() {
		return nameFirstHolder;
	}
	public void setNameFirstHolder(String nameFirstHolder) {
		this.nameFirstHolder = nameFirstHolder;
	}
	public String getKycSecondHolder() {
		return kycSecondHolder;
	}
	public void setKycSecondHolder(String kycSecondHolder) {
		this.kycSecondHolder = kycSecondHolder;
	}
	public String getDobSecondHolder() {
		return dobSecondHolder;
	}
	public void setDobSecondHolder(String dobSecondHolder) {
		this.dobSecondHolder = dobSecondHolder;
	}
	public String getCifSecondHolder() {
		return cifSecondHolder;
	}
	public void setCifSecondHolder(String cifSecondHolder) {
		this.cifSecondHolder = cifSecondHolder;
	}
	public String getModeOfOperation() {
		return modeOfOperation;
	}
	public void setModeOfOperation(String modeOfOperation) {
		this.modeOfOperation = modeOfOperation;
	}
	public String getDepositType() {
		return depositType;
	}
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmountWords() {
		return amountWords;
	}
	public void setAmountWords(String amountWords) {
		this.amountWords = amountWords;
	}
	public String getMaturityInstruction() {
		return maturityInstruction;
	}
	public void setMaturityInstruction(String maturityInstruction) {
		this.maturityInstruction = maturityInstruction;
	}
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	public String getModScheme() {
		return modScheme;
	}
	public void setModScheme(String modScheme) {
		this.modScheme = modScheme;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getRecurringDeposit() {
		return recurringDeposit;
	}
	public void setRecurringDeposit(String recurringDeposit) {
		this.recurringDeposit = recurringDeposit;
	}
	public String getMonthlyInstallment() {
		return monthlyInstallment;
	}
	public void setMonthlyInstallment(String monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
	public String getAmountType() {
		return amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	public String getPeriodYears() {
		return periodYears;
	}
	public void setPeriodYears(String periodYears) {
		this.periodYears = periodYears;
	}
	public String getPeriodMonths() {
		return periodMonths;
	}
	public void setPeriodMonths(String periodMonths) {
		this.periodMonths = periodMonths;
	}
	public String getStandingInstructions() {
		return standingInstructions;
	}
	public void setStandingInstructions(String standingInstructions) {
		this.standingInstructions = standingInstructions;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getDebitAccountNo() {
		return debitAccountNo;
	}
	public void setDebitAccountNo(String debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}
//	public MultipartFile getAccountHolderSignature() {
//		return accountHolderSignature;
//	}
//	public void setAccountHolderSignature(MultipartFile accountHolderSignature) {
//		this.accountHolderSignature = accountHolderSignature;
//	}
//	public String getSecondAccountHolderSignature() {
//		return secondAccountHolderSignature;
//	}
//	public void setSecondAccountHolderSignature(String secondAccountHolderSignature) {
//		this.secondAccountHolderSignature = secondAccountHolderSignature;
//	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeRelationship() {
		return nomineeRelationship;
	}
	public void setNomineeRelationship(String nomineeRelationship) {
		this.nomineeRelationship = nomineeRelationship;
	}
	public String getNomineeAge() {
		return nomineeAge;
	}
	public void setNomineeAge(String nomineeAge) {
		this.nomineeAge = nomineeAge;
	}
	public String getNomineeDob() {
		return nomineeDob;
	}
	public void setNomineeDob(String nomineeDob) {
		this.nomineeDob = nomineeDob;
	}
	public String getNomineeAddress() {
		return nomineeAddress;
	}
	public void setNomineeAddress(String nomineeAddress) {
		this.nomineeAddress = nomineeAddress;
	}
	public String getNomineeCity() {
		return nomineeCity;
	}
	public void setNomineeCity(String nomineeCity) {
		this.nomineeCity = nomineeCity;
	}
	public String getNomineeState() {
		return nomineeState;
	}
	public void setNomineeState(String nomineeState) {
		this.nomineeState = nomineeState;
	}
	public String getNomineeKyc() {
		return nomineeKyc;
	}
	public void setNomineeKyc(String nomineeKyc) {
		this.nomineeKyc = nomineeKyc;
	}
//	public String getAccountDepositorSignature() {
//		return accountDepositorSignature;
//	}
//	public void setAccountDepositorSignature(String accountDepositorSignature) {
//		this.accountDepositorSignature = accountDepositorSignature;
//	}
	
	
	
}
