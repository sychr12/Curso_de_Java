package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Innerimportedproduct;
import entities.produtos;
import entities.usedproduct;

public class prama {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<produtos> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Datos do produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			if (type == 'c') {
				list.add(new produtos(name, preco));
			}
			else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new usedproduct(name, preco, date));
			}
			else {
				System.out.print("Taxa de importacao: ");
				double cusnt = sc.nextDouble();
				list.add(new Innerimportedproduct(name, preco, cusnt));
			}
		}

		System.out.println("=============================");
		System.out.println("ETIQUETAS DE PRECO:");
		System.out.println("=============================");
		for (produtos prod : list) {
			System.out.println(prod.precoTag());
		}
		System.out.println("=============================");
		sc.close();
	}
}