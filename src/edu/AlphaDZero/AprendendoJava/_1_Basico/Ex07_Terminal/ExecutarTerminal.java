package edu.AlphaDZero.AprendendoJava._1_Basico.Ex07_Terminal;

import java.util.Scanner;

public class ExecutarTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a mesagem: ");
        String mensagem = scan.next();scan.close();
        final String caminho ="C:/Users/Marques/OneDrive/Documentos/AlphaProject/AlphaDJava/bin";
        final String arquivoJava = "java edu.AlphaDZero.AprendendoJava.Ex07_Terminal.TesteTerminal ";
        try{
            Runtime.getRuntime().exec("cmd.exe /c cd "+caminho);
            Runtime.getRuntime().exec(arquivoJava+mensagem);
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}
