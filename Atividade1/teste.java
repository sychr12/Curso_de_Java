
public class teste {
  public static void main(String[] args) {
    String produto1 ="Computer";
    String produto2 ="Office desk";

    int idade = 20;
    int code = 943;
    char genero = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;


    System.out.printf("%s, which price is %.2f\n", produto1 ,price1);
    System.out.printf("%s, which price is %.2f\n",produto2 ,price2);

    System.out.printf("recorde: %d years old, code %d and gernder %c\n", idade,code,genero);

    System.out.printf("measue with eight decimal place: %.8f\n", measure);
    System.out.printf("rouded (three decimal places): %.3f\n", measure);
    System.out.printf("U decimal point: %.3f\n", measure);
  }
}
