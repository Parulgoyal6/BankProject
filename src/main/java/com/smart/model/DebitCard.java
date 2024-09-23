package com.smart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DebitCard {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String applicationNo;
	private String name;
	private String nameOnCard;
	private String address;
	private String city;
	private String state;
	private String telephone;
	private String email;
	private String accountNo;
	private String accountType;
	private String gender;
	private String cardType;
	private String place;
	private String date;
	private String signature;
	private String card;
	private String officeDate;
	private String branchCode;
	private String cif;
	private String issueCard;
	private String branchSignature;
	private String oldCardNo;
	private String ticketNo;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getOfficeDate() {
		return officeDate;
	}
	public void setOfficeDate(String officeDate) {
		this.officeDate = officeDate;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getIssueCard() {
		return issueCard;
	}
	public void setIssueCard(String issueCard) {
		this.issueCard = issueCard;
	}
	public String getBranchSignature() {
		return branchSignature;
	}
	public void setBranchSignature(String branchSignature) {
		this.branchSignature = branchSignature;
	}
	public String getOldCardNo() {
		return oldCardNo;
	}
	public void setOldCardNo(String oldCardNo) {
		this.oldCardNo = oldCardNo;
	}
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	
	
	
	
}
