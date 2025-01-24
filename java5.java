
import java.util.Locale;
import java.util.Scanner;

public class java4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        System.err.print("PorFavor Informe o numero de Fucionarios \n");
        int  a = sc.nextInt();
        System.err.print("a hora do fucionario\n");
        int  b = sc.nextInt();
        System.err.print("o salario do fucionario\n");
        double  c = sc.nextDouble();

        int numero = a;
        double salario = b * c;
        

        System.out.println("Quantidade de Fucionario =  " + numero);
        System.out.printf("salario total do fucionario = %.2f\n ", salario);

        sc.close();
    }
    
}
