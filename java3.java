
import java.util.Locale;

public class java3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Locale.setDefault((Locale.US));
        
        double a = 2.00, area,area1,area2;
        double b = 100.64;
        double c = 150.00;
        double pi = 3.14159;

        area = pi * a * a;
        area1 = pi * b *b;
        area2 = pi * c *c;

        System.err.printf("Valor = %.7f\n",area);
        System.err.printf("Valor = %.7f\n",area1);
        System.err.printf("Valor = %.7f\n",area2);
    }
    
}
