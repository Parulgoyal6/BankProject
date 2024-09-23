package com.smart;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.smart.model.Deposit;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FixedDepositController {
	 @Autowired
	    private DepositRepository depositRepository;
	 	@PostMapping("/submitDeposit")
	 	public String submitDeposit(
			 
				@RequestParam String date,
				@RequestParam String accountNo,
				@RequestParam String kycFirstHolder,
				@RequestParam String holderType,
				@RequestParam String dobFirstHolder,
				@RequestParam String cifFirstHolder,
				@RequestParam String titleFirstHolder,
				@RequestParam String nameFirstHolder,
				@RequestParam String kycSecondHolder,
				@RequestParam String dobSecondHolder,
				@RequestParam String cifSecondHolder,
				@RequestParam String modeOfOperation,
				@RequestParam String depositType,
				@RequestParam String amount,
				@RequestParam String amountWords,
				@RequestParam String maturityInstruction,
				@RequestParam String paymentOption,
//				@RequestParam String modScheme,
				@RequestParam String Bank,
//				@RequestParam String recurringDeposit
//				@RequestParam String monthlyInstallment
				@RequestParam String amountType,
				@RequestParam String periodYears,
				@RequestParam String periodMonths,
//				@RequestParam String standingInstructions,
//				@RequestParam String Number
				@RequestParam String debitAccountNo,
//				@RequestParam("accountHolderSignature") MultipartFile accountHolderSignature,
//				@RequestParam("secondAccountHolderSignature") MultipartFile secondAccountHolderSignature,
//				@RequestParam String secondAccountHolderSignature,
				@RequestParam String nomineeName,
				@RequestParam String nomineeRelationship,
				@RequestParam String nomineeAge,
				@RequestParam String nomineeDob,
				@RequestParam String nomineeAddress,
				@RequestParam String nomineeCity,
				@RequestParam String nomineeState,
				@RequestParam String nomineeKyc
			//	@RequestParam("accountDepositorSignature") MultipartFile accountDepositorSignature
				//@RequestParam String accountDepositorSignature
			 ) {
	 		Deposit deposit=new Deposit();
	 		deposit.setDate(date);
	 		deposit.setAccountNo(accountNo);
	 		deposit.setKycFirstHolder(kycFirstHolder);
	 		deposit.setHolderType(holderType);
	 		deposit.setDobFirstHolder(dobFirstHolder);
	 		deposit.setCifFirstHolder(cifFirstHolder);
	 		deposit.setTitleFirstHolder(titleFirstHolder);
	 		deposit.setNameFirstHolder(nameFirstHolder);
	 		deposit.setKycSecondHolder(kycSecondHolder);
	 		deposit.setDobSecondHolder(dobSecondHolder);
	 		deposit.setCifSecondHolder(cifSecondHolder);
	 		deposit.setModeOfOperation(modeOfOperation);
	 		deposit.setDepositType(depositType);
	 		deposit.setAmount(amount);
	 		deposit.setAmountWords(amountWords);
	 		deposit.setMaturityInstruction(maturityInstruction);
	 		deposit.setPaymentOption(paymentOption);
//	 		deposit.setModScheme(modScheme);
	 		deposit.setBank(Bank);
//	 		deposit.setMonthlyInstallment(monthlyInstallment);
	 		deposit.setAmountType(amountType);
	 		deposit.setPeriodYears(periodYears);
	 		deposit.setPeriodMonths(periodMonths);
//	 		deposit.setStandingInstructions(standingInstructions);
//	 		deposit.setNumber(Number);
	 		deposit.setDebitAccountNo(debitAccountNo);
//	 		deposit.setAccountHolderSignature(accountHolderSignature);
//	 		deposit.setAccountHolderSignature(secondAccountHolderSignature);
//	 		deposit.setSecondAccountHolderSignature(secondAccountHolderSignature);
	 		deposit.setNomineeName(nomineeName);
	 		deposit.setNomineeRelationship(nomineeRelationship);
	 		deposit.setNomineeAge(nomineeAge);
	 		deposit.setNomineeDob(nomineeDob);
	 		deposit.setNomineeAddress(nomineeAddress);
	 		deposit.setNomineeCity(nomineeCity);
	 		deposit.setNomineeState(nomineeState);
	 		deposit.setNomineeKyc(nomineeKyc);
	 		//deposit.setAccountDepositorSignature(accountDepositorSignature);
	 		depositRepository.save(deposit);
//	 		 try {
//	 	        // Save the uploaded files locally
//	 	        if (!accountHolderSignature.isEmpty()) {
//	 	            String accountHolderSignaturePath = saveFile(accountHolderSignature);
//	 	            deposit.setAccountHolderSignaturePath(accountHolderSignaturePath);
//	 	        }
////
////	 	        if (!secondAccountHolderSignature.isEmpty()) {
////	 	            String secondHolderSignaturePath = saveFile(secondAccountHolderSignature);
////	 	            deposit.setSecondAccountHolderSignaturePath(secondHolderSignaturePath);
////	 	        }
////
////	 	        if (!accountDepositorSignature.isEmpty()) {
////	 	            String depositorSignaturePath = saveFile(accountDepositorSignature);
////	 	            deposit.setAccountDepositorSignaturePath(depositorSignaturePath);
////	 	        }
////
//	 	        depositRepository.save(deposit);
//	 	    } catch (IOException e) {
//	 	        e.printStackTrace();
//	 	        return "error";
//	 	    }

	 	    return "success";
	 	}
//	 	private String saveFile(MultipartFile file) throws IOException {
//	 	    String fileName = file.getOriginalFilename();
//	 	    String uploadDir = new File("uploads").getAbsolutePath(); // Define your directory here
//	 	    File uploadPath = new File(uploadDir);
//
//	 	    if (!uploadPath.exists()) {
//	 	        uploadPath.mkdirs();
//	 	    }
//
//	 	    Path filePath = Paths.get(uploadDir, fileName);
//	 	    Files.write(filePath, file.getBytes());
//	 	    
//	 	    return filePath.toString();
//	 	}

}
