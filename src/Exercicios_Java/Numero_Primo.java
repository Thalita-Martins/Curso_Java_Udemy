package Exercicios_Java;

import java.util.Scanner;

public class Numero_Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                cont ++;
            }
        }
        if (cont == 0){
            System.out.println(num + " É número primo.");
        }else{
            System.out.println(num + " Não é número primo.");
        }
        sc.close();
    }
}
