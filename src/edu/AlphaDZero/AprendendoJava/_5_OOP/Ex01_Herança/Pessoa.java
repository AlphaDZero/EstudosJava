package edu.AlphaDZero.AprendendoJava._5_OOP.Ex01_Herança;

public class Pessoa {

    private String cpf = "?cpf?";
    private String nome = "Desconhecido";
    private String dataNascimento = "?data de nascimento?";

    public Pessoa() {}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
    }

    
}
