
package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.smart.model.CreditCard;
@Controller
public class CreditCardController {
	 @Autowired
	    private CreditCardRepository creditCardRepository;

	 	@PostMapping("/submitCreditCardForm")
	 	public String submitFormDebit(
	 			
	 			@RequestParam String applicationNo,
	 			@RequestParam String name,
	 			@RequestParam String nameOnCard,
	 			@RequestParam String address,
	 			@RequestParam String city,
	 			@RequestParam String state,
	 			@RequestParam String telephone,
	 			@RequestParam String email,
	 			@RequestParam String accountNo,
	 			@RequestParam String accountType,
	 			@RequestParam String gender,
	 			@RequestParam String cardType,
	 			@RequestParam String place,
	 			@RequestParam String date,
	 			@RequestParam String signature,
	 			@RequestParam String card,
	 			@RequestParam String officeDate,
	 			@RequestParam String branchCode,
	 			@RequestParam String cif,
	 			@RequestParam String issueCard,
	 			@RequestParam String branchSignature,
	 			@RequestParam String oldCardNo,
	 			@RequestParam String ticketNo
	 			
	 			) {
	 		CreditCard t=new CreditCard();
	 		t.setApplicationNo(applicationNo);
	 		t.setName(name);
	 		t.setNameOnCard(nameOnCard);
	 		t.setAddress(address);
	 		t.setCity(city);
	 		t.setState(state);
	 		t.setTelephone(telephone);
	 		t.setEmail(email);
	 		t.setAccountNo(accountNo);
	 		t.setAccountType(accountType);
	 		t.setGender(gender);
	 		t.setCardType(cardType);
	 		t.setPlace(place);
	 		t.setDate(date);
	 		t.setSignature(signature);
	 		t.setCard(card);
	 		t.setOfficeDate(officeDate);
	 		t.setBranchCode(branchCode);
	 		t.setCif(cif);
	 		t.setIssueCard(issueCard);
	 		t.setBranchSignature(branchSignature);
	 		t.setOldCardNo(oldCardNo);
	 		t.setTicketNo(ticketNo);
	 		creditCardRepository.save(t);
	 		
	 		return "success";
	 	}
}
