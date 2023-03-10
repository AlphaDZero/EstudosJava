package edu.AlphaDZero.AprendendoJava.Ex11_Switch;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        System.out.print("Digite a senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.next();scanner.close();

        switch(senha){
            case "20211040100046":
                System.out.println("Seja bem vindo, AlphaZero");
                break;
            case "20221045108711":
                System.out.println("Seja bem vindo, Elden Lord");
                break;
            default:
                System.out.println("Senha incorreta");
                break;
        }
    }
}
