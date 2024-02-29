package org.example.ex14;

//14-Criar um algoritmo que imprima todos os números de 11 até 89 e a soma deles.

public class Ex14 {
    public static void main(String[] args) {

        int soma = 0;

        System.out.println("Números de 11 até 89:");
        for (int i = 11; i <= 89; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\nSoma dos números: " + soma);
    }
}
