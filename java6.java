
import java.util.Locale;
import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        int quat, quat1,codi1,codi2;
        double peca1, peca2, total;

        System.err.print("Digite os codigos da pecas \n");
        codi1 = sc.nextInt();
        quat = sc.nextInt();
        peca1 = sc.nextDouble();

        codi2 = sc.nextInt();
        quat1 = sc.nextInt();
        peca2 = sc.nextDouble();
        

        total = peca1 * peca2 + quat * quat1;
        


        System.out.printf("Valor a Pagar R$ = %.2f\n ",total);

        sc.close();
    }
    
}
