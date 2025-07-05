    import java.util.ArrayList;
    import java.util.Locale;
    import java.util.Scanner;
    import java.util.List;

    import entities.shape;
    import entities.color;
    import entities.circulo;
    import entities.retangulo;


public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <shape> list = new ArrayList<>();

        System.out.println("Enter the number of shape");
        int n = sc.nextInt();

        for(int  i=1; i<=n; i++){
            System.out.println("Shape #" + i + "Date");
            System.out.println("Retangulo ou circulo (R/c) ");
            char ch = sc.next().charAt(0);

            System.out.print("Coloar (black,blue,red) ");
            color color = color.valueOf(sc.next());

            if(ch == 'r'){
                System.out.println("Altura");
                double altura = sc.nextDouble();
                System.out.println("Largura");
                double largura = sc.nextDouble();
                list.add(new retangulo(color, largura, altura));
            }else {
                System.out.println("raio");
                double raio = sc.nextDouble();
                list.add(new circulo(color, raio));
            }
        }

        System.out.println("============================");
        System.out.println("Shape areas: ");
        System.out.println("============================");
        for (shape shape : list){
            System.out.println(String.format("%.2f",shape.area()));
        System.out.println("============================");
        }


        sc.close();
   }

    
    
}
