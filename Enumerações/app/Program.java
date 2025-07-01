package app;

import java.util.Date;

import Status.Main;
import entities.ordem;

public class Program {
    
    public static void main(String[] args) {
    
        ordem ordem = new ordem(1080, new Date(), Main.PENDING_PAYMENT);

        System.out.println(ordem);

        Main os1 = Main.DEVILERED;

        Main os2 = Main.valueOf("DEVILERED");

        System.err.println(os1);
        System.err.println(os2);
    }
    
}
