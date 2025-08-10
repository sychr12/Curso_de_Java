package servicer;

public interface OnlinePaymentService {

	
	double paymenlfee(double amount);
	double interest(double amount, int months);
}


