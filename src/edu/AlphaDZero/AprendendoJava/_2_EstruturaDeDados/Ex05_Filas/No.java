package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex05_Filas;

public class No {
    
    private Object objeto;
    private No ultimo = null;

    public No(Object objeto) {
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {
        return "No [objeto=" + objeto + "]";
    }
}
