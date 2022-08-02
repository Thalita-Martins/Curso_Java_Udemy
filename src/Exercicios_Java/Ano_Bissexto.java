package Exercicios_Java;

import java.util.Scanner;

public class Ano_Bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        boolean bissexto = ano % 4 == 0 && ((ano %100) !=0 || ano % 400 == 0);
        if (bissexto == true){
            System.out.println(ano + " é um ano bissexto!");
        }else {
            System.out.println(ano + " não é um ano bissexto!");
        }
        sc.close();
    }
}
