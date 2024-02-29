package org.example.ex18;

//18-Entrar com 20 números e imprimir a soma dos positivos e o total de números negativos.

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 20;
        int somaPositivos = 0;
        int totalNegativos = 0;

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                totalNegativos++;
            }
        }

        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println("Total de números negativos: " + totalNegativos);

        scanner.close();
    }
}
