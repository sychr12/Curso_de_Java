package Aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Veiculo;
import model.entities.carRental;
import model.service.BrazilTaxService;
import model.service.RentalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		
		System.out.println("Coloque os dados do carro");
		System.out.println("Modelo do carro");
		String carModel = sc.nextLine();
		
		System.out.println("Retirada: (dd/MM/yyyy): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		
		
		System.out.println("Retorno: (dd/MM/yyyy): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
		
		carRental cr = new carRental(start, finish, new Veiculo(carModel));
		
		//Pra teste
		
		System.out.println("Entre com o preco de tudo");
		double princePerHour = sc.nextDouble();
		System.out.println("Entre com o preco por dia");
		double pricePerDay = sc.nextDouble();
		
		
		RentalService rentalService = new RentalService(pricePerDay, princePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("Fatura: ");
		System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
		System.out.println("Imporsto " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
	}

}
