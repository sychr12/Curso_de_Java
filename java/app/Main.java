//Muito Ruim
package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.reserva;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.err.println("Numero do quarto");
        int roomNumber = sc.nextInt();
        System.err.println("Check-in na data (dd/mm/yyyy)");
        Date checkin = sdf.parse(sc.next());
        System.err.println("Check-out na data (dd/mm/yyyy)");
        Date checkout = sdf.parse(sc.next());

        if (!checkout.after(checkin)) {
            System.out.println("As datas nao batem");
        } else {
            reserva reserva = new reserva(null, checkin, checkout);
            System.out.println(reserva);

            System.out.println();
            System.out.println("Entre com a data pra fazer uma nova reserva");
            System.err.println("Check-in na data (dd/mm/yyyy)");
            checkin = sdf.parse(sc.next());
            System.err.println("Check-out na data (dd/mm/yyyy)");
            checkout = sdf.parse(sc.next());

            String error = reserva.updateDates(checkin, checkout);
            if (error != null) {
                System.out.println(" Erro ao fazer a reserva" + error);
            } else {
                System.out.println("Reserva + " + reserva);

            }

            sc.close();
        }
    }
}