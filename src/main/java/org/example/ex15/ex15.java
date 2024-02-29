package org.example.ex15;

//15-Criar um algoritmo que imprima a soma dos números pares entre 25 e 200.

public class ex15 {
    public static void main(String[] args) {
        int somaPares = 0;

        for (int i = 25; i <= 200; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }

        System.out.printf("A soma dos números pares entre 25 e 200 é: %d%n", somaPares);
    }
    }
