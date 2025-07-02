package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import entities.Horadecontrato;
import entities.departamento;
import entities.work;
import Status.cargo;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nome do Departamento: ");
        String departamentName = sc.nextLine();

        System.out.print("Nome: ");
        String workName = sc.nextLine();

        System.out.print("level (JUNIOR/MED_LEVEL/SENIOR): ");
        String worklevel = sc.nextLine();

        System.out.print("base salarial: ");
        Double worksalario = sc.nextDouble();

        work work = new work(workName, cargo.valueOf(worklevel.toUpperCase()), worksalario, new departamento(departamentName));

        System.out.print("quantos contratos tem o usuario: ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        for(int i=1; i<=n; i++){
            System.out.println("Contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf1.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duração (horas): ");
            int hours = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            Horadecontrato contract = new Horadecontrato(contractDate, valuePerHour, hours);
            work.addContract(contract);
        }

        System.out.print("Coloque a data pra calcular o seu salario (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + work.getName());
        System.out.println("Departamento: " + work.getDepartamento().getName());
        System.out.println("Quanto ganhou no mes: " + monthAndYear + ": " + String.format("%.2f", work.income(year, month)));

        sc.close();
    }
}
