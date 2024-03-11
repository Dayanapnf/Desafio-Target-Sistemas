package org.example;
import java.util.Scanner;

public class questao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if (verificarFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    private static boolean verificarFibonacci(int num) {
        // Verifica se 5n^2 + 4 ou 5n^2 - 4 é um quadrado perfeito
        return isPerfeitoQuadrado(5 * num * num + 4) || isPerfeitoQuadrado(5 * num * num - 4);
    }

    private static boolean isPerfeitoQuadrado(int n) {
        int raizQuadrada = (int) Math.sqrt(n);
        return raizQuadrada * raizQuadrada == n;
    }
}
