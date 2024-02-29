package org.example.ex09;

//Ler dois números e imprimir todos s números entre eles.
//Suponha que o segundo número é maior que o primeiro.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (segundoNumero > primeiroNumero) {
            System.out.println("Números entre " + primeiroNumero + " e " + segundoNumero + ":");
            for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("O segundo número deve ser maior que o primeiro.");
        }

        scanner.close();
    }
}
