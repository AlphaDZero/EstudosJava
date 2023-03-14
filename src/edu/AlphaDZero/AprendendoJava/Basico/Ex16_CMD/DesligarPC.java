package edu.AlphaDZero.AprendendoJava.Basico.Ex16_CMD;

public class DesligarPC {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("cmd.exe /c shutdown /s");
        }
        catch (Exception e){
            System.out.println("Erro do tipo: "+e);
        }
    }
}
