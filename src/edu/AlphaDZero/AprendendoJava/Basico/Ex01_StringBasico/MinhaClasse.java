package edu.AlphaDZero.AprendendoJava.Basico.Ex01_StringBasico;

public class MinhaClasse {

    public static void main(String[] args) {
        String nome = "Andre";
        String sobrenome = "Ricardo";
        String nomeCompleto = NomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String NomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
