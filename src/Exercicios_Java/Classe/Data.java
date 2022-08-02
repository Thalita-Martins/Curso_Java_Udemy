package Exercicios_Java.Classe;

public class Data {
    int dia;
    int mes;
    int ano;

    //Sempre utilizar métodos que retornam o valor(string)
    String obterDataFormatada(){
        return String.format("%d/%d/%d",dia, mes,ano);
    }
    //Este de método não funciona e aplicação Web, Mobile
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
