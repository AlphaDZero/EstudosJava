package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex04_Pilhas.Bloco;

public class Bloco {

    private int valorInterno;
    private Bloco referenciaSolo = null;
    
    public Bloco(int valorInterno) {
        this.valorInterno = valorInterno;
    }

    public int getValorInterno() {
        return valorInterno;
    }

    public void setValorInterno(int valorInterno) {
        this.valorInterno = valorInterno;
    }

    public Bloco getReferenciaSolo() {
        return referenciaSolo;
    }

    public void setReferenciaSolo(Bloco referenciaSolo) {
        this.referenciaSolo = referenciaSolo;
    }

    @Override
    public String toString() {
        return "Bloco [valorInterno=" + valorInterno + ", referenciaSolo=" + referenciaSolo + "]";
    }

    
}
