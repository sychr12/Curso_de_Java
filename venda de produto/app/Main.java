package app;
// Importa classes para manipulação de datas, entrada de dados e formatação
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

// Importa as entidades do sistema
import entities.cliente;
import entities.order;
import entities.orderitem;
import entities.produto;
import Status.status;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Entrada dos dados do cliente
        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        Date aniversario = sdf.parse(sc.next());
        sc.nextLine();

        cliente cliente = new cliente(nome, email, aniversario);

        // Entrada dos dados do pedido
        System.out.println("Digite os dados do pedido:");
        System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
        status orderStatus = status.valueOf(sc.next().toUpperCase());
        sc.nextLine();
        

        order order = new order(new Date(), orderStatus.name(), cliente);

        System.out.print("Quantos itens tem neste pedido? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Digite os dados do item #" + i + ":");
            System.out.print("Nome do produto: ");
            String nomepd = sc.nextLine();
            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            produto produto = new produto(nomepd, preco);

            System.out.print("Quantidade do produto: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            orderitem orderitem = new orderitem(quantidade, preco, produto);
            order.additems(orderitem);
        }

        System.out.println();
        System.out.println();
        System.out.println("RESUMm");
        System.out.println();
        System.out.println(order);
        System.out.println();
        sc.close();
    }
}
