package checklist;

public class Main {
    public static void main(String[] args) {
        

        double price = 400.00;

        @SuppressWarnings("unused")
        double discount = 0;

        if(price < 200.00) {
             discount = price * 0.1;
        }else {
             discount = price * 0.05;
        }

        System.out.println(price);
    }
}
