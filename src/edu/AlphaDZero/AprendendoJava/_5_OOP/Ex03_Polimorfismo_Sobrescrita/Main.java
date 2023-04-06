package edu.AlphaDZero.AprendendoJava._5_OOP.Ex03_Polimorfismo_Sobrescrita;

public class Main {
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classeMae : classes) {
            classeMae.metodo1();
        }

        System.out.println();

        for (ClasseMae classeMae : classes) {
            classeMae.metodo2();
        }

        System.out.println();

        ClasseFilha2 filha2 = new ClasseFilha2();
        filha2.metodo2(); 

    }
}
