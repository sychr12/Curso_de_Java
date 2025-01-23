import java.util.Locale;
import java.util.Scanner;


public class teste {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
      //pode trocar
      try (Scanner sc = new Scanner(System.in)) {
          //pode trocar
          String x;
          int y;
          double z;
          
          System.out.println("Digite os dados");
          x = sc.next();
          y = sc.nextInt();
          z = sc.nextDouble();
          
          System.out.printf("teste ");
          System.out.println(x);
          System.out.println(y);
          System.out.println(z);
      }
  }
}
