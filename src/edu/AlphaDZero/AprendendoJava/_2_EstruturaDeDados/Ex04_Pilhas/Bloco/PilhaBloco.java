package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex04_Pilhas.Bloco;

public class PilhaBloco {
    
    private Bloco blocoTopo = null;

    public PilhaBloco() {}

    public void empilharBloco(Bloco novoBloco){
        novoBloco.setReferenciaSolo(blocoTopo);
        blocoTopo = novoBloco;
    }

    public Bloco topoPilha(){
        return blocoTopo;
    }

    public Bloco retirarTopo(){
        if (blocoTopo != null){
            Bloco topo = blocoTopo;
            blocoTopo = blocoTopo.getReferenciaSolo();
            return topo;
        }
        return new Bloco(1010);
    }

    @Override
    public String toString() {
        String mensagem = "";
        Bloco blocoAuxiliar = blocoTopo;

        while(blocoAuxiliar != null){
            mensagem += "[{Dados = "+blocoAuxiliar.getValorInterno()+" }]\n";
            blocoAuxiliar = blocoAuxiliar.getReferenciaSolo();
        }
        return mensagem;
    }

    
    
}
