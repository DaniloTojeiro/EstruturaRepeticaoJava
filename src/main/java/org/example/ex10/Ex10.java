package org.example.ex10;

//10-Leia 5 idades e calcule a média entre as idades(usar variável para idade).

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdades = 5;
        int somaIdades = 0;

        for (int i = 1; i <= totalIdades; i++) {
            System.out.print("Informe a idade " + i + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / totalIdades;

        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}
