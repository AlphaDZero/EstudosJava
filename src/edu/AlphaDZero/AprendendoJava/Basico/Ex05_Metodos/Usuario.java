package edu.AlphaDZero.AprendendoJava.Basico.Ex05_Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? "+ smartTv.ligada);
        System.out.println("Qual canal? "+ smartTv.canal);
        System.out.println("Qual volume? "+ smartTv.volume);
        smartTv.ligar();
        System.out.println("TV ligada? "+ smartTv.ligada);
        smartTv.mudarCanal(11);
        System.out.println("Qual canal? "+ smartTv.canal);
        smartTv.mudarVolume(30);
        System.out.println("Qual volume? "+ smartTv.volume);




    }
}
