package edu.AlphaDZero.AprendendoJava.EstruturaDeDados.Ex01_PrimitivoObjeto;

public class ReferenciarAtribuir {
    public static void main(String[] args) {
        combinarInt();
        System.out.println("Ja em objeto ...");
        combinarObjeto();
    }

    public static void combinarInt(){
        int a = 1;
        int b = a;
        System.out.println("A = "+a+" B = "+b);
        System.out.println("Mas se for adicionado 1 em A...");
        a++;
        System.out.println("A = "+a+" B = "+b);
    }

    public static void combinarObjeto(){
        Objeto objetoA = new Objeto(1);
        Objeto objetoB = objetoA;
        System.out.println("objetoA = "+objetoA.getElemento()+" objetoB = "+objetoB.getElemento());
        System.out.println("Mas se for adicionado 1 em objetoA ...");
        objetoA.setElemento(2);
        System.out.println("objetoA = "+objetoA.getElemento()+" objetoB = "+objetoB.getElemento());
    }


}
