public class Exercicios {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.printf("%s,which price is $%.2f\n",product1, price1);
        System.out.printf("%s, which price is $%.2f\n",product2, price2);

        System.out.printf("Record: %s years old, code %s and gender: %c\n", age, code, gender);

        System.out.printf("Measue with eigth decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        System.out.printf("Us decimal point: %.3f", measure);

        

    }
    
}
