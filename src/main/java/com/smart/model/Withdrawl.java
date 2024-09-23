package com.smart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Withdrawl {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String date;
	 	private String accountNo;
	 	private String amount;
	 	private String phoneNumber;
	 //	private String accountHolderSignature;
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
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
	 	
	 	

}
