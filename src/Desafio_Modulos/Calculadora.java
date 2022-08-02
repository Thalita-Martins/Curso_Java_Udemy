package Desafio_Modulos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double num1 = sc.nextDouble();
        System.out.print("Informe um número: ");
        double num2 = sc.nextDouble();
        System.out.print("Informe a operação: ");
        String op = sc.next();

        double res = "+".equals(op) ? num1 + num2 :0 ;
        res = "-".equals(op) ? num1 - num2 : res;
        res = "/".equals(op) ? num1 / num2 : res;
        res = "*".equals(op) ? num1 * num2 : res;
        res = "%".equals(op) ? num1 % num2 : res;
        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, res);
        sc.close();
    }
}
