package edu.AlphaDZero.AprendendoJava._5_OOP.Ex02_Upcast;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Google");
        gerente.setNome("AlphaDZero");
        System.out.println(gerente);
    }
}
