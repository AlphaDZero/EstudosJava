package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex09_List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("BMW"));
        listaCarros.add(new Carro("Audi"));
        listaCarros.add(new Carro("Fiat")); 

        System.out.println(listaCarros.contains(new Carro("Audi")));
        System.out.println(listaCarros.get(2));
        System.out.println(listaCarros.indexOf(new Carro("Audi")));
        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);
    }
}
