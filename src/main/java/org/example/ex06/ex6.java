package org.example.ex06;

//Faça um programa que exiba na tela todos os números entre 83 e 108 que sejam divisíveis por 9.

public class ex6 {
    public static void main(String[] args) {
        for (int i = 83; i <= 108; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
            }
        }
    }
}
