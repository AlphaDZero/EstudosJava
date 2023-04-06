package edu.AlphaDZero.AprendendoJava._3_Metodos.Ex01;

public class Format {
    private String valor;

    public Format(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public double stringDouble(){
        return Double.parseDouble(this.valor);
    }

    public void transformar(){
        try {
            stringDouble();
        }
        catch (Exception e) {
            System.out.println("Erro do tipo: "+ e);
        }
    }
}
