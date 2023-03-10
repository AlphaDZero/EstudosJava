package edu.AlphaDZero.AprendendoJava.Ex04_Operadores;

public class OperadoresJava {
    public static void main(String[] args) {
        exemploOpRelacionais();
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

    public static void exemploTernario(){
        System.out.println("Exemplo de operador ternario...");
        int a,b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);
    }

    public static void exemploOpRelacionais(){
        String msg = """
            == igualdade
            != diferença
            >  maior que
            >= maior ou igual a...
            <  menor que
            <= menor ou igual a...
            && operador logico E
            || operador logico OU
        """;
        System.out.println(msg);
    }

}
