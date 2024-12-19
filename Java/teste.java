
import java.util.Locale;

public class teste {
  public static void main(String[] args) {

    int y = 2;
    int idade = 20;
    double renda = 23.09434;
    String nome = "seila";

    double x = 10.938493;

    System.out.println(y);
    System.out.println("Ola, Mundo!");
    System.out.printf("%.2f\n",x);
    System.out.printf("%.4f\n",x);
    Locale.setDefault(Locale.US);
    System.out.printf("%.4f\n",x);
    System.out.printf("RESULTADO = " + x + "\nMETROS");
    System.out.printf("RESULTADO =  %.2f metros\n",x);
    System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n",nome ,idade ,renda);
  }
}
