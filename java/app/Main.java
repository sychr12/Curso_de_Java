//Muito Ruim
package app;

import entities.dominion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.reserva;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.err.println("Numero do quarto");
            int roomNumber = sc.nextInt();
            System.err.println("Check-in na data (dd/mm/yyyy)");
            Date checkin = sdf.parse(sc.next());
            System.err.println("Check-out na data (dd/mm/yyyy)");
            Date checkout = sdf.parse(sc.next());


            reserva reserva = new reserva(roomNumber, checkin, checkout);
            System.out.println(reserva);

            System.out.println();
            System.out.println("Entre com a data pra fazer uma nova reserva");
            System.err.println("Check-in na data (dd/mm/yyyy)");
            checkin = sdf.parse(sc.next());
            System.err.println("Check-out na data (dd/mm/yyyy)");
            checkout = sdf.parse(sc.next());

            reserva.updateDates(checkin, checkout);
            System.out.println("Reserva + " + reserva);
        }

        catch(ParseException e){
            System.out.println("Data invalida");
        }

        catch(dominion e){
            System.out.println("Erro da reserva" + e.getMessage());
        }

        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
        sc.close();

    }   
    
}
