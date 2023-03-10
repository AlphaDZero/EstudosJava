package edu.AlphaDZero.AprendendoJava.Ex10_If;

import java.util.Scanner;

public class Academico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("digite sua media: ");
        double media = ler.nextDouble();
        ler.close();
        if(media>=6){
            System.out.println("aprovado");
        }
        else if(media<2){
            System.out.println("reprovado");
        }
        else{
            System.out.println("recuperar");
        }
        System.out.println("sua media era: "+media);
    }
}
