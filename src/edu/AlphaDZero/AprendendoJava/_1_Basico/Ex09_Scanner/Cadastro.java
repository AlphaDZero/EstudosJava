package edu.AlphaDZero.AprendendoJava._1_Basico.Ex09_Scanner;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.next();

        System.out.print("digite sua idade: ");
        int idade = ler.nextInt();

        System.out.print("Digite sua matricula: ");
        String matricula = ler.next();
        ler.close();

        System.out.println("seu cadastro foi realizado com sucesso");
        System.out.println("Dados...");
        System.out.println();
        System.out.println("nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Matricula: "+matricula);

    }
}
