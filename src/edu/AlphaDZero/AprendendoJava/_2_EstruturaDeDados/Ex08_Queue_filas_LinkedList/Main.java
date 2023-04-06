package edu.AlphaDZero.AprendendoJava._2_EstruturaDeDados.Ex08_Queue_filas_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("BMW"));
        queueCarros.add(new Carro("Porche"));

        System.out.println(queueCarros.add(new Carro("Mercedes")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("Lamborgine")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
    }
}
