package org.example.ex12;

//12-Imprimir o quadrado dos números de 1 até 20.

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Quadrados dos números de 1 até 20:");
        for (int i = 1; i <= 20; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " é: " + quadrado);
        }
    }
}
