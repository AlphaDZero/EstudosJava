package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex04_Pilhas.Bloco;

public class MainPilhaBloco {
    public static void main(String[] args) {
        PilhaBloco minhPilhaBloco = new PilhaBloco();
        minhPilhaBloco.empilharBloco(new Bloco(1));
        minhPilhaBloco.empilharBloco(new Bloco(0));
        minhPilhaBloco.empilharBloco(new Bloco(9));
        System.out.println(minhPilhaBloco);
        System.out.println(minhPilhaBloco.topoPilha().getValorInterno());
        System.out.println(minhPilhaBloco);
        Bloco b1 = minhPilhaBloco.retirarTopo();
        System.out.println(b1.getValorInterno());
        System.out.println();
        System.out.println(minhPilhaBloco);
        PilhaBloco p1 = new PilhaBloco();
        System.out.println(p1.retirarTopo().getValorInterno());;
    }
}
