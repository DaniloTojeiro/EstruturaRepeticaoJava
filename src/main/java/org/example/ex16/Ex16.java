package org.example.ex16;

//16-Ler 10 números e imprimir quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 10;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}
