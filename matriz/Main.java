package matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê um número inteiro 'n' que representa a dimensão da matriz (n x n)
        int n = sc.nextInt();

        // Cria uma matriz quadrada de inteiros com n linhas e n colunas
        int[][] mat = new int[n][n];

        // Lê os elementos da matriz fornecidos pelo usuário
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Imprime os elementos da diagonal principal da matriz
        System.out.println("Mais diagonal");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " "); // mat[i][i] são os elementos da diagonal principal
        }
        System.err.println(); // Pula linha (imprime no stderr, mas poderia ser System.out também)

        // Conta quantos números negativos existem na matriz
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        // Imprime a quantidade de números negativos encontrados
        System.out.println("Numeros negativos \n" + count);

        sc.close(); // Boa prática: fechar o Scanner após o uso
    }
}
