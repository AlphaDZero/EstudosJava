package edu.AlphaDZero.AprendendoJava._1_Basico.Ex05_Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal  = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    public void mudarCanal(int valor){
        canal = valor;
    }

    public void mudarVolume(int valorAtual){
        volume = valorAtual;
    }
}
