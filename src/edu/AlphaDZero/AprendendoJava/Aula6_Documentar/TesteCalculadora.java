package edu.AlphaDZero.AprendendoJava.Aula6_Documentar;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora operar = new Calculadora();
        double resultado = operar.somar(11, 9);
        System.out.println(resultado);
    }
}
