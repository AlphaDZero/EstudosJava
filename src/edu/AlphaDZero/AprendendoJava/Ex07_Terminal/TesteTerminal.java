package edu.AlphaDZero.AprendendoJava.Ex07_Terminal;

public class TesteTerminal {
    public static void main(String[] args) {
        String mensagem ="";
        for (String string : args) {
            mensagem += string;
        }
        try{
            final String caminho, comando;
            caminho = "C:/Users/Marques/OneDrive/Documentos/AlphaProject/AlphaDJava/src/edu/AlphaDZero/AprendendoJava/Ex07_Terminal";
            comando = "echo "+mensagem+" > arq.txt";
            Runtime.getRuntime().exec("cmd.exe /c cd "+caminho);
            Runtime.getRuntime().exec("cmd.exe /c"+comando);
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}
