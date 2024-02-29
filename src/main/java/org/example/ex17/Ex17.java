package org.example.ex17;

//17-Entrar com 15 números e imprimir quantos números maiores que 30 foram digitados.

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 15;
        int maioresQue30 = 0;

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 30) {
                maioresQue30++;
            }
        }

        System.out.println("Quantidade de números maiores que 30: " + maioresQue30);

        scanner.close();
    }
}
