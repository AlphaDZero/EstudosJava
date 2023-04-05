package edu.AlphaDZero.AprendendoJava.Métodos.Ex01;
/**
 * <h1>Questão 1</h1>
 * <p>a) Calcule as 4 operações básicas: soma, multiplicação, subtração e divisão.</p>
 * @author AlphaDZero
 * @version 1.0.0
 * @since 05/04/2023
 */
public class Calculadora {
    /**
     * <h4>Esse método realiza a soma de dois números</h4>
     * @param numero1 primeiro número.
     * @param numero2 segundo número.
     * @return retorna a soma entre os numeros.
     */
    public static double somar(double numero1, double numero2){
        return numero1 + numero2;
    }
    /**
     * <h4>Esse método subtrai dois números</h4>
     * @param numero1 primeiro número
     * @param numero2 segundo número
     * @return retorna a subtração numero1 - numero2
     */
    public static double subtrair(double numero1, double numero2){
        return numero1 - numero2;
    }
    /**
     * <h4>Esse método multiplica dois números</h4>
     * @param numero1 primeiro número
     * @param numero2 segundo número
     * @return retorna numero1*numero2
     */
    public static double multiplicar(double numero1, double numero2){
        return numero1*numero2;
    }
    /**
     * <h4>Esse método realiza uma divisão</h4>
     * @param numerador parte de cima da fração
     * @param denominador parte de baixo da fração
     * @return retorna o resultado numerador/denominador na forma de string
     */
    public static Format dividir(double numerador, double denominador){
        try{
            return new Format(String.valueOf(numerador/denominador));
        }
        catch(Exception e){
            return new Format("Erro do tipo: "+e); 
        }
    }
}
