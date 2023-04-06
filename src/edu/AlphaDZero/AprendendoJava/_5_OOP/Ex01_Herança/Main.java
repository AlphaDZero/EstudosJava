package edu.AlphaDZero.AprendendoJava._5_OOP.Ex01_Herança;

public class Main {
    public static void main(String[] args) {
        
        Aluno estudante = new Aluno();
        estudante.setNome("AlphaDZero");

        for (String string : estudante.organizarDados()) {
            System.out.println(string);
        }
    }
}
