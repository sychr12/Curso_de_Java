package Aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Installment;
import entities.contract;
import servicer.ContractService;
import servicer.PaymentService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.println("Numero: ");
		int number = sc.nextInt();
		System.out.println("Data {dd/MM/yyyy} ");
		LocalDate date = LocalDate.parse(sc.next(), dt1);
		System.out.println("Valor do Contrato: ");
		double totalValue = sc.nextDouble();
		
		contract obj  = new contract(number, date, totalValue);
		
		System.out.println("Entre com numero de Parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaymentService());
		
		contractService.processContract(obj, n);
		
		
		System.out.println("Parcela: ");
		for(Installment installmentd : obj.getInstallments())
			System.out.println(installmentd);
		sc.close();

	}

}
