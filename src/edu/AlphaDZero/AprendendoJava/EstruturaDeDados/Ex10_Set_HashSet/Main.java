package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex10_Set_HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> setCarros = new HashSet<>();
        setCarros.add(new Carro("BMW"));
        setCarros.add(new Carro("Corvette"));
        setCarros.add(new Carro("Porche"));
        System.out.println(setCarros);

        Set<Carro> treeCarros = new TreeSet<>();
        treeCarros.add(new Carro("BMW"));
        treeCarros.add(new Carro("Corvette"));
        treeCarros.add(new Carro("Porche"));
        System.out.println(treeCarros);
    }
}
