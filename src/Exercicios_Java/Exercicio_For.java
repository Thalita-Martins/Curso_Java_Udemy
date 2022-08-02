package Exercicios_Java;

import java.util.Scanner;

public class Exercicio_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valor = "#";
        for (int i = 1; i <=5; i++){
            System.out.println(valor);
            valor += "#";
        }
        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
