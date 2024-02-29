package org.example.ex11;

//11-Ler dois números e imprimir todos os números ímpares entre eles. Suponha que o segundo é maior que o primeiro.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (segundoNumero > primeiroNumero) {
            System.out.println("Números ímpares entre " + primeiroNumero + " e " + segundoNumero + ":");
            for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("O segundo número deve ser maior que o primeiro.");
        }

        scanner.close();
    }
}
