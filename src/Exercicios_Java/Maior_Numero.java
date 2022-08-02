package Exercicios_Java;

import java.util.Scanner;

public class Maior_Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, maior = 0;
        while (cont <=10){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (num > maior){
                maior = num;
            }
            cont++;
        }
        System.out.println(" Maior número : " + maior
        );
    }
}
