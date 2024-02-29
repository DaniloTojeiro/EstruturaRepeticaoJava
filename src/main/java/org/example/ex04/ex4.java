package org.example.ex04;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        do{
            System.out.println("Digite um valor entre 1 e 10: ");
            valor = scanner.nextInt();
        } while (valor < 1 || valor > 10);

        System.out.println("Tabuada de " + valor + ".");
        for (int i = 1; i <= 10; i++){
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        scanner.close();
    }
}
