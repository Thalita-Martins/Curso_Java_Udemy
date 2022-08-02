package Exercicios_Java;

import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        char letra[] = palavra.toCharArray();
        for (int i = 0; i < letra.length; i++){
            System.out.println(letra[i]);
        }
    }
}
