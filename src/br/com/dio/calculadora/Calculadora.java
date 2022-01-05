package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b= scan.nextInt();

        int somar = somar(a, b);
        int subtra = subtra(a, b);
        int divi = divi(a, b);
        int multi = multi(a, b);


        System.out.println("Soma:" + somar);
        System.out.println("Subtração:" + subtra);
        System.out.println("Divisão:" +divi);
        System.out.println("Multiplicação:" +multi);

    }
    public static int somar(int a, int b){
        return a + b;
    }public static int subtra(int a, int b){
        return a - b;
    }public static int divi(int a, int b){
        return a / b;
    }public static int multi(int a, int b){
        return a * b;
    }
}
