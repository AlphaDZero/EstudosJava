package edu.AlphaDZero.AprendendoJava._5_OOP.Ex01_Herança;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private String matricula = "?Matricola?";

    public Aluno() {}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<String> organizarDados(){
        List<String> dados = new ArrayList<>();
        dados.add(this.getNome());
        dados.add(this.getDataNascimento());
        dados.add(this.getCpf());
        dados.add(this.getMatricula());
        return dados;
    }

    
}
