package br.edu.fatecpg.tarefa1;

import java.util.Scanner;
     
public class exercicio2 {

	public static void main(String[] args) {
        double num1, num2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num1 = ler.nextDouble();
        System.out.println("Digite outro Número: ");
        num2 = ler.nextDouble();
        if(num1 == num2){
            System.out.println("Número Iguais");
        } else if (num1 != num2) {
            System.out.println("São Diferentes");
            if(num1 > num2){
                System.out.println("O 1º é maior");
            } else if (num1 < num2) {
                System.out.println("O 2º é maior");
                }
            }
        }
}

