package edu.AlphaDZero.AprendendoJava.Aula4_Operadores;

public class OperadoresJava {
    public static void main(String[] args) {
        exemploBoolean();
    }

    public static void exemploConstante(){
        System.out.println("Constante...");
        final double PI = 3.1415;
        System.out.println(PI);
    }

    public static void exemploOperadorSoma(){
        System.out.println("soma...");
        int x = 1 + 2;
        System.out.println(x);
        System.out.println("Concatenação...");
        String mensagem = "teste"+" "+"1";
        System.out.println(mensagem);
        System.out.println("incrementação...");
        x++;
        System.out.println(x);
    }

    public static void exemploOperadorSubtrair(){
        System.out.println("subtrai...");
        double y = 3.1415 - 2.71;
        System.out.println(y);
        System.out.println("decremento...");
        y--;
        System.out.println(y);
    }

    public static void exemploBoolean(){
        System.out.println("Negar valor Boolean");
        boolean True = true;
        True = !True;
        System.out.println(True);
    }

    
}
