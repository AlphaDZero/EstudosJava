package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex07_Stack_pilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();
        stackCarros.push(new Carro("BMW"));
        stackCarros.push(new Carro("Volkswagen"));
        stackCarros.push(new Carro("Mercedes"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);
        System.out.println(stackCarros.empty());
    }
}
