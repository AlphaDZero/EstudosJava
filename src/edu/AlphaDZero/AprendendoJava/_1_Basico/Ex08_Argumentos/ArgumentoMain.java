package edu.AlphaDZero.AprendendoJava._1_Basico.Ex08_Argumentos;


public class ArgumentoMain {
    public static void main(String[] args) {
        String nome      = args[0];
        String sobrenome = args[1];
        int idade        = Integer.valueOf(args[2]);
        double altura    = Double.valueOf(args[3]);

        System.out.println("Olá, sou "+ nome+ " "+sobrenome);
        System.out.println("tenho "+idade+" anos");
        System.out.println("minha autura é "+altura);

    }
    
}
