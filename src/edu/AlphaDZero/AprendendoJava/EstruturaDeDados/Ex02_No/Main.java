package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex02_No;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("conteudo1");
        No no2 = new No("conteudo2");
        No no3 = new No("conteudo3");
        No no4 = new No("conteudo4");
        //apontar referencia
        no1.setProximo(no2);
        no2.setProximo(no3);
        no3.setProximo(no4);
        //Logo... no1->no2->no3->no4->null
        System.out.println(no1);
        System.out.println(no1.getProximo());
        System.out.println(no1.getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo().getProximo());
    }
}
