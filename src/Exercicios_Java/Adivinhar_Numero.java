package Exercicios_Java;

import java.util.Random;
import java.util.Scanner;

public class Adivinhar_Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int num;
        Random numeroAleatorio = new Random();
        num = numeroAleatorio.nextInt(100);
        while (cont <= 10){
            System.out.println("Tentativa " + cont);
            System.out.print("Digite um número de 0 até 100: ");
            int op = sc.nextInt();
            if (num == op){
                System.out.println("Parabéns você acertou o número!!!!");
                break;
            }else{
                if (op < num){
                    System.out.println("Você errou!!! este número é menor!");
                }else{
                    System.out.println("Você errou!!! este número é maior");
                }
            }
            cont++;
        }
        System.out.println("Número de tentativas encerradas!");
    }
}
