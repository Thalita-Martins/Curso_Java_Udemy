package Exercicios_Java;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdNotas = 0;
        double nota = 0, total = 0;
        while (nota != -1){
            System.out.print("Informe a nota (ou -1 para sair): ");
            nota = sc.nextDouble();
            if (nota <= 10 && nota >= 0){
                total+= nota;
                qtdNotas++;
            } else{
                System.out.println("Nota inválida!");
            }
        }
        double media = total / qtdNotas;
        System.out.printf("Média = %.2f", media);
        sc.close();
    }
}
