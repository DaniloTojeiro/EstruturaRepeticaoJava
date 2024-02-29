package org.example.ex08;

//8-Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados idade, sexo(M/F) e salário.
//Faça um algoritmo que informe:
//a)a média de salário do grupo;
//b)quantidade de mulheres com salário até R$1500,00.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        char sexo;
        double salario;
        double somaSalarios = 0;
        int contadorMulheres1500 = 0;
        int totalPessoas = 0;

        System.out.print("Informe o número de habitantes: ");
        int numHabitantes = scanner.nextInt();

        for (int i = 0; i < numHabitantes; i++) {
            System.out.println("\nHabitante " + (i + 1) + ":");

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.print("Sexo (M/F): ");
            sexo = scanner.next().charAt(0);

            System.out.print("Salário: R$");
            salario = scanner.nextDouble();

            somaSalarios += salario;

            totalPessoas++;

            if (sexo == 'F' && salario <= 1500) {
                contadorMulheres1500++;
            }
        }

        double mediaSalarios = somaSalarios / totalPessoas;

        System.out.println("\nResultados da pesquisa:");
        System.out.println("a) Média de salário do grupo: R$" + mediaSalarios);
        System.out.println("b) Quantidade de mulheres com salário até R$1500,00: " + contadorMulheres1500);

        scanner.close();
    }
}
