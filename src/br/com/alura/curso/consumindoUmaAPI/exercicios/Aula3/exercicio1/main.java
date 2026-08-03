package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula3.exercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int segundoValor = sc.nextInt();
        try{
            int resultado  = primeiroValor / segundoValor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: divisão por zero não permitida.");
        }
    }
}
