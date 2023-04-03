package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex11_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();
        aluno.put("nome", "Andre");
        aluno.put("idade", "20");
        aluno.put("media", "9.1");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

    }
}
