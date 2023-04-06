package edu.AlphaDZero.AprendendoJava._4_Desafios;

import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double somatorio = 0;
        double input;
        int contador = 0;

        for(int i = 0; i < 6; i++){
            System.out.println("Digite um numero: ");
            input = scan.nextDouble();
            if(input >= 0){
                contador ++;
                somatorio += input;
            }
        }
        scan.close();
        double media = somatorio/contador;

        System.out.println(contador + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
