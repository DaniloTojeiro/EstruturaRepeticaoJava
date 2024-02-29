package org.example.ex02;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (isPrimo(numero)){
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    public static boolean isPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
