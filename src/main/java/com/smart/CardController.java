package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.smart.model.DebitCard;
@Controller
public class CardController {
	 @Autowired
	    private DebitCardRepository debitCardRepository;

	 	@PostMapping("/submitATMForm")
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
	 		DebitCard debit=new DebitCard();
	 		debit.setApplicationNo(applicationNo);
	 		debit.setName(name);
	 		debit.setNameOnCard(nameOnCard);
	 		debit.setAddress(address);
	 		debit.setCity(city);
	 		debit.setState(state);
	 		debit.setTelephone(telephone);
	 		debit.setEmail(email);
	 		debit.setAccountNo(accountNo);
	 		debit.setAccountType(accountType);
	 		debit.setGender(gender);
	 		debit.setCardType(cardType);
	 		debit.setPlace(place);
	 		debit.setDate(date);
	 		debit.setSignature(signature);
	 		debit.setCard(card);
	 		debit.setOfficeDate(officeDate);
	 		debit.setBranchCode(branchCode);
	 		debit.setCif(cif);
	 		debit.setIssueCard(issueCard);
	 		debit.setBranchSignature(branchSignature);
	 		debit.setOldCardNo(oldCardNo);
	 		debit.setTicketNo(ticketNo);
	 		debitCardRepository.save(debit);
	 		
	 		return "success";
	 	}
}
