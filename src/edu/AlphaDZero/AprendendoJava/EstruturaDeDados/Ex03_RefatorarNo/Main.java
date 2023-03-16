package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex03_RefatorarNo;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("conteudo1");
        No<String> no2 = new No<>("conteudo2");
        No<String> no3 = new No<>("conteudo3");
        No<String> no4 = new No<>("conteudo4");
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
