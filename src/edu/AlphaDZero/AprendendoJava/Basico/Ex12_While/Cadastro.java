package edu.AlphaDZero.AprendendoJava.Basico.Ex12_While;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Digite seu nome: ");
            nome = scan.next();
            if(nome.equals("0"))
                break;
            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();
            System.out.println("cadastro realizado com sucesso");
            System.out.println("Seu nome: "+nome);
            System.out.println("Sua idade "+idade);
        }
        scan.close();
    }
}
