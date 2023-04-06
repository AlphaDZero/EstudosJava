package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex04_Pilhas.BlocoComplexo;

public class Main {
    public static void main(String[] args) {
        PilhaBlocoComplexo pilha = new PilhaBlocoComplexo();
        pilha.empilharBloco(new BlocoComplexo<>("String"));
        pilha.empilharBloco(new BlocoComplexo<>(11));
        pilha.empilharBloco(new BlocoComplexo<>(null));
        pilha.empilharBloco(new BlocoComplexo<>(22.0f));
        System.out.println(pilha);

    }
    
}
