package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex04_Pilhas.BlocoComplexo;

public class PilhaBlocoComplexo {
    
    private BlocoComplexo<?> blocoTopo = null;

    public PilhaBlocoComplexo() {}

    public void empilharBloco(BlocoComplexo<?> novoBloco){
        novoBloco.setReferenciaSolo(blocoTopo);
        blocoTopo = novoBloco;
    }

    public BlocoComplexo<?> topoPilha(){
        return blocoTopo;
    }

    public BlocoComplexo<?> retirarTopo(){
        if (blocoTopo != null){
            BlocoComplexo<?> topo = blocoTopo;
            blocoTopo = blocoTopo.getReferenciaSolo();
            return topo;
        }
        return new BlocoComplexo<>("Vazio");
    }

    @Override
    public String toString() {
        String mensagem = "";
        BlocoComplexo<?> blocoAuxiliar = blocoTopo;

        while(blocoAuxiliar != null){
            mensagem += "[{Dados = "+blocoAuxiliar.getDados()+" }]\n";
            blocoAuxiliar = blocoAuxiliar.getReferenciaSolo();
        }
        return mensagem;
    }

    
    
}
