package org.example.ex13;

//13-Ciar um algoritmo que imprima os números pares no intervalo de 1 a 600.

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Números pares no intervalo de 1 a 600:");
        for (int i = 1; i <= 600; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
