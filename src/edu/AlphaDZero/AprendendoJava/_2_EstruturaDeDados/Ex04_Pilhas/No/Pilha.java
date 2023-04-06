package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex04_Pilhas.No;

public class Pilha {
    private No refEntradaNo = null;

    public Pilha() {
    }

    public boolean isEmpty(){
        return refEntradaNo == null ? true : false;
    }

    public No top(){
        return refEntradaNo;
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPop = this.refEntradaNo;
            this.refEntradaNo = this.refEntradaNo.getReferenciaNo();
            return noPop;
        }
        return null;
    }
    
    public void push(No novoNo){
        No noAuxiliar = this.refEntradaNo;
        this.refEntradaNo   = novoNo;
        this.refEntradaNo.setReferenciaNo(noAuxiliar);
    }

    @Override
    public String toString() {

        String mensagem = "---------------\n";
        mensagem += "     Pilha\n";
        mensagem += "---------------\n";

        No noAuxiliar = this.refEntradaNo;

        while(noAuxiliar != null){
            mensagem += "[{Dados = "+noAuxiliar.getDado()+" }]\n";
            noAuxiliar = noAuxiliar.getReferenciaNo();
        }
        mensagem += "---------------\n";

        return mensagem;
    }

    
}
