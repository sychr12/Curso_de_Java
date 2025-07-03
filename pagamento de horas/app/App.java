package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.println("quantidade fucionarios");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employe " + i + "Data: ");
            System.err.print("fucionario e tercerizado? (Y/N) ");
            char ch = sc.next().charAt(0);
            System.out.print(" Nome ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas ");
            int horas = sc.nextInt();
            System.out.print("Valor por Hora ");
            Double pagametoporhora = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Adicionar taxa ");
                double additionalcharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, horas, pagametoporhora, additionalcharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, horas, pagametoporhora);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("Pagamentos ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.pagamento()));
        }

        sc.close();
    }
}
