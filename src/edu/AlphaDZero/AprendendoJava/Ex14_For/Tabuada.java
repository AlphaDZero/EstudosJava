package edu.AlphaDZero.AprendendoJava.Ex14_For;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja saber a tabuada de qual valor? ");
        int valor = scan.nextInt();scan.close();
        for(int i = 1;i < 11; i++){
            System.out.println(i+"X"+valor+" = "+(i*valor));
        }
    }
}
