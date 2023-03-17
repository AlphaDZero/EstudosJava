package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex04_Pilhas;

public class Main {
    public static void main(String[] args) {
        Pilha minhPilha = new Pilha();
        minhPilha.push(new No(1));
        minhPilha.push(new No(2));
        System.out.println(minhPilha);
        minhPilha.pop();
        System.out.println(minhPilha);
    }
}
