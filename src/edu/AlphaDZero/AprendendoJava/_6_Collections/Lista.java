package edu.AlphaDZero.AprendendoJava._6_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lista {

    public static void main(String[] args) {


        List<Double> notas = new ArrayList<>(Arrays.asList(7.0, 9.8));
        notas.add(3.5);
        System.out.println(notas);
        System.out.println(notas.indexOf(9.8));
        System.out.println();


        //por o elemento em determinada posição
        notas.add(1,5.0);
        System.out.println(notas);
        System.out.println();


        //substituir nota
        notas.set(1, 8.6);
        System.out.println(notas);
        System.out.println();


        //verificar se ha um elemento
        System.out.println(notas.contains(3.5));
        System.out.println(notas.contains(5.0));
        System.out.println();


        //pegar um elemento da lista
        double nota = notas.get(2);
        System.out.println(nota);
        System.out.println();


        //menor nota
        System.out.println(Collections.min(notas));
        System.out.println();


        //maior nota
        System.out.println(Collections.max(notas));
        System.out.println();


        //somatorio 
        Iterator<Double> iterator = notas.iterator();
        double somatorio = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            somatorio += next;
        }
        System.out.println(somatorio);
        System.out.println();


        //Quantidade de itens
        System.out.println(notas.size());
        System.out.println();


        //Remover elemento
        notas.remove(3);
        notas.remove(9.8);
        System.out.println(notas);
        System.out.println();


        //Remover objetos menor que 8
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            double next = iterator2.next();
            if(next < 8) iterator2.remove();
        }
        System.out.println(notas);
        System.out.println();


        //apagar lista
        notas.clear();
        System.out.println(notas);
        System.out.println();


        //verificar se a lista ta vazia
        System.out.println(notas.isEmpty());

    }
}
