package br.edu.fatecpg.tarefa1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num = ler.nextDouble();
        if(num > 0){
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número Negativo");
        }
    }
}