package edu.AlphaDZero.AprendendoJava._1_Basico.Ex02_CondBasico;

public class BoletimEstudantil {
    
    public static void main(String[] args) {
        double media = 2;
        if (media < 6 && media >=2)
            System.out.println("Recuperação");
        else if (media > 6)
            System.out.println("Aprovado");
        else 
            System.out.println("Reprovado");
    }

}
