package org.example.ex21;

//21-Entrar com um número inteiro positivo e exibir o fatorial deste número, lembrando que 0! = 1.Exemplo: 5! = 5x4x3x2x1 = 120.

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println(numero + "! = " + fatorial);
        }

        scanner.close();
    }
}
