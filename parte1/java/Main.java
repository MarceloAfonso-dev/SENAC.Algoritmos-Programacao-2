import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 1:");
        exercicio1();
        System.out.println("\nExercício 2:");
        exercicio2();
        System.out.println("\nExercício 3:");
        exercicio3();
    }

    public static int[][] matriz5x5() {
        int[][] matriz = new int[5][5];
        Random random = new Random();
        for (int[] linha : matriz) {
            for (int i = 0; i < linha.length; i++) {
                linha[i] = random.nextInt(5,9);
            }
        }
        return matriz;
    }

    public static int calcularDiagonal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static void exercicio1() {
        int[][] matriz = matriz5x5();
        System.out.println("Matriz 5x5:");
        for (int[] linha : matriz) {
            for (int i : linha) {
                System.out.printf("%4d", i); // Espaçamento de 4 caracteres
            }
            System.out.println();
        }
        System.out.println("Soma da diagonal principal: " + calcularDiagonal(matriz));
    }

    public static int[][] matriz10x10() {
        int[][] matriz = new int[10][10];
        int valor;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                valor = i < j ? 2 * i + 7 * j - 2 : i == j ? 3 * i * i - 1 : 4 * i * i * i - 5 * j * j + 1;
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static void exercicio2() {
        int[][] matriz = matriz10x10();
        System.out.println("Matriz 10x10:");
        for (int[] linha : matriz) {
            for (int i : linha) {
                System.out.printf("%6d", i); // Espaçamento de 6 caracteres
            }
            System.out.println();
        }
    }

    public static int[][] reduzirMatriz(int[][] matriz, int novoTamanho) {
        int[][] novaMatriz = new int[novoTamanho][novoTamanho];
        for (int i = 0; i < novoTamanho; i++) {
            for (int j = 0; j < novoTamanho; j++) {
                novaMatriz[i][j] = matriz[i][j];
            }
        }
        return novaMatriz;
    }

    public static int calcularDeterminante(int[][] matriz) {
        if (matriz.length == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else if (matriz.length == 3) {
            return (matriz[0][0] * matriz[1][1] * matriz[2][2] + matriz[0][1] * matriz[1][2] * matriz[2][0] + matriz[0][2] * matriz[1][0] * matriz[2][1]) - (matriz[0][2] * matriz[1][1] * matriz[2][0] + matriz[0][1] * matriz[1][0] * matriz[2][2] + matriz[0][0] * matriz[1][2] * matriz[2][1]);
        } else {
            return -1;
        }
    }

    public static void exercicio3() {
        int[][] matriz5x5 = matriz5x5();
        int[][] matriz3x3 = reduzirMatriz(matriz5x5, 3);
        int[][] matriz2x2 = reduzirMatriz(matriz3x3, 2);

        System.out.println("Matriz 3x3:");
        for (int[] linha : matriz3x3) {
            for (int i : linha) {
                System.out.printf("%4d", i); // Espaçamento de 4 caracteres
            }
            System.out.println();
        }
        System.out.println("Determinante: " + calcularDeterminante(matriz3x3));


        System.out.println("Matriz 2x2:");
        for (int[] linha : matriz2x2) {
            for (int i : linha) {
                System.out.printf("%4d", i); // Espaçamento de 4 caracteres
            }
            System.out.println();
        }
        System.out.println("Determinante: " + calcularDeterminante(matriz2x2));
    }
}
