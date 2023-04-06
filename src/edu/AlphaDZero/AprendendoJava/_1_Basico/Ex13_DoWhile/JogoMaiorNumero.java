package edu.AlphaDZero.AprendendoJava._1_Basico.Ex13_DoWhile;

import java.util.Scanner;

public class JogoMaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maiorNumero = 0;
        double numero;
        int contador = 0;

        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextDouble();
            if(numero > maiorNumero)
                maiorNumero = numero;
            contador++;
        }
        while(contador<5);
        scan.close();
        System.out.println("Maior numero é "+maiorNumero);

    }
}
