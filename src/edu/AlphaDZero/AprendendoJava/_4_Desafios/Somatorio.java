package edu.AlphaDZero.AprendendoJava._4_Desafios;

import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {

        double h = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            h += 1.0/i;
        }
        scan.close();
        System.out.println(String.format("%.0f", h));
    }
}
