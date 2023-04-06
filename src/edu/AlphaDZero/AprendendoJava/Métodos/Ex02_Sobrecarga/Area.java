package edu.AlphaDZero.AprendendoJava.Métodos.Ex02_Sobrecarga;

public class Area {

    public static void area(double x){
        System.out.println("A area do quadrado é "+ x*x + " metros quadrados");
    }

    public static void area(double x, double y){
        System.out.println("A area do retangulo é "+ x*y + " metros quadrados");
    }
    
}
