package servicer;

import java.time.LocalDate;

import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(entities.contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i=1; i<= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			
			double fee = onlinePaymentService.paymenlfee(basicQuota + interest);
			
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
			
			
		}
	}
	
	
}
