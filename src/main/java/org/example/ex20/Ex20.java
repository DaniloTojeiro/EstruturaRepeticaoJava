package org.example.ex20;

//20-Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 3 centímetros por ano.
//Construir um algoritmo que calcule e imprima quantos anos serão necessários para que Juca seja maior que Chico

public class Ex20 {

    public static void main(String[] args) {
        double alturaChico = 1.50;
        double alturaJuca = 1.10;
        int anos = 0;

        while (alturaJuca <= alturaChico) {
            alturaChico += 0.02;
            alturaJuca += 0.03;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Juca seja mais alto que Chico.");
    }
}
