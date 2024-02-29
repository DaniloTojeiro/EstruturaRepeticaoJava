package org.example.ex19;

//19-Ler vários número e informar quantos números entre 100 e 200 foram digitados.
//Quando o valor 0(zero) for lido, o algoritmo deverá cessar sua execução.

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosEntre100e200 = 0;

        while (true) {
            System.out.print("Informe um número (ou digite 0 para encerrar): ");
            int numero = scanner.nextInt();

            if (numero >= 100 && numero <= 200) {
                numerosEntre100e200++;
            }

            if (numero == 0) {
                break;
            }
        }

        System.out.println("Quantidade de números entre 100 e 200: " + numerosEntre100e200);

        scanner.close();
    }
}
