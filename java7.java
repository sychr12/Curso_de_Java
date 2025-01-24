
import java.util.Locale;
import java.util.Scanner;


public class java6 {
    public static void main(String[] args) {
        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        double A,B,C, TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        TRIANGULO = A * C /2.0;
        CIRCULO = 3.14159 * C * C;
        TRAPEZIO = (A+B)/2.0*C;
        QUADRADO = B*B;
        RETANGULO = A*B;





        System.err.printf("TRIANGULO %.3f\n",TRIANGULO);
        System.err.printf("CIRCULO %.3f\n",CIRCULO);
        System.err.printf("TRAPEZIO %.3f\n",TRAPEZIO);
        System.err.printf("QUADRADO %.3f\n",QUADRADO);
        System.err.printf("RETANGULO %.3f\n",RETANGULO);


    }
    
}
