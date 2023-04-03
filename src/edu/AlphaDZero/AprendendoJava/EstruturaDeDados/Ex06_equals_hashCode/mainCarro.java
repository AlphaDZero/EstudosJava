package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex06_equals_hashCode;

import java.util.ArrayList;
import java.util.List;

public class mainCarro {
    public static void main(String[] args) {

        List<carro> listacarros = new ArrayList<>();
        listacarros.add(new carro("BMW"));
        listacarros.add(new carro("Volkswagen"));
        listacarros.add(new carro("Ferrari"));

        System.out.println(listacarros.contains(new carro("BMW")));
        System.out.println(new carro("BMW").hashCode());
    }
}
