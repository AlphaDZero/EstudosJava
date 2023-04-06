package edu.AlphaDZero.AprendendoJava._5_OOP.Ex02_Upcast;

public class Gerente extends Funcionario {
    
    private String empresa;

    public Gerente(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Gerente [empresa=" + empresa + "]";
    }

}
