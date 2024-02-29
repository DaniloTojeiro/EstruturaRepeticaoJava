package org.example.ex07;

//Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos(incluindo os valores lidos na soma).
// Considere que o segundo valor será sempre maior que o primeiro valor lido.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os dois valores
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Calcular a soma dos inteiros entre os dois valores
        int soma = 0;
        for (int i = valor1; i <= valor2; i++) {
            soma += i;
        }

        // Escrever o resultado
        System.out.println("A soma dos inteiros entre os valores é: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}
