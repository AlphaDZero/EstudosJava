package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex04_Pilhas.Bloco;

public class MainBloco {
    public static void main(String[] args) {
        Bloco b1 = new Bloco(1);
        Bloco b2 = new Bloco(2);
        b2.setReferenciaSolo(b1);
        System.out.println(b2);
    }
    
}
