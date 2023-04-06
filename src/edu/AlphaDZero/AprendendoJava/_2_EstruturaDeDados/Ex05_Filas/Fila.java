package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex05_Filas;

public class Fila {
    private No ultimof = null;

    public Fila() {}

    public boolean isEmpty(){
        return this.ultimof == null ? true :false;
    }

    public void enqueue(No novo){
        novo.setUltimo(ultimof);
        ultimof = novo;
    }

    public No first(){
        if(!this.isEmpty()){
            
        }
        return null;
    }

    

}
