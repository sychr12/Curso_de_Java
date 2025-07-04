package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class usedproduct extends produtos{

        private LocalDate manufatura;



        public usedproduct(String name, double preco, LocalDate manufatura) {
            super(name, preco);
            this.manufatura = manufatura;
        }

        public LocalDate getManufatura() {
            return manufatura;
        }

        public void setManufatura(LocalDate manufatura) {
            this.manufatura = manufatura;
        }

        public String priceTag(){
            return getName()+ " (used) $ " + String.format("%.2f", precoTag())+ " (Manufacture date: "+ manufatura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ ")";
        }

        

    }

    

