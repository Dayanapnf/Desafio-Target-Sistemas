package org.example;
import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();


        String invertedString = inverterString(input);


        System.out.println("String original: " + input);
        System.out.println("String invertida: " + invertedString);
    }


    private static String inverterString(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            // Trocando os caracteres nas posições start e end
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;


            start++;
            end--;
        }

        return new String(chars);
    }
}

