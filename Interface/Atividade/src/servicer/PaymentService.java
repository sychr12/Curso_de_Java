package servicer;

public class PaymentService implements OnlinePaymentService {

	@Override
	public double paymenlfee(double amount) {
		
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		// TODO Auto-generated method stub
		return amount * 0.01 * months;
	}

}
