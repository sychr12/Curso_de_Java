
import java.util.Locale;

public class aula1 {
    //entrada de dados
    public static void main(String[] args) {

        //declarar um valor
        int y =32;
        double x = 10.35784;

        //declarar valor 2
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        //esse não faz a quebra de linha
        System.out.print("ola");
        System.out.print("ola.");
        System.out.print(y);
        System.out.print(x);


        //isso aqui faz a quebra de linha
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println(y);

        //quando vc quer quantidade certa de casas decimais
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f\n", x);


        //vai ser responsavel por juntar as palavras tipo(ola + mundo = ola mundo)
        System.out.println("Resultado = "+ x + " Metros\n");
        System.out.printf("Resultado = %.2f Metros\n", x);

        //serve pra localizar a aplicação (import java.util.Locale;)
        Locale.setDefault(Locale.US);


        //agora e so testar algumas variaveis
        System.err.printf("%s tem %d anos e ganha %.2f Reais \n", nome, idade, renda);




        //saida de dados(cmd abaixo)
    }
    
}
