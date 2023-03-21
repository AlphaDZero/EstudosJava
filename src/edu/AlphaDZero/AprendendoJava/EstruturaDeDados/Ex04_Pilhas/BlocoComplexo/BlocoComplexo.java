package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex04_Pilhas.BlocoComplexo;

public class BlocoComplexo<T> {

    private T dados = null;
    private BlocoComplexo<?> referenciaSolo = null;

    public BlocoComplexo(T dados) {
        this.dados = dados;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }

    public BlocoComplexo<?> getReferenciaSolo() {
        return referenciaSolo;
    }

    public void setReferenciaSolo(BlocoComplexo<?> referenciaSolo) {
        this.referenciaSolo = referenciaSolo;
    }

    @Override
    public String toString() {
        return "BlocoComplexo [dados=" + dados + ", referenciaSolo=" + referenciaSolo + "]";
    }

    
    

    
}
