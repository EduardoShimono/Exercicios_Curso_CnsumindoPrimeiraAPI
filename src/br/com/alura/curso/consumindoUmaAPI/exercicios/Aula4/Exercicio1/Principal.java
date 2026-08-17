package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula4.Exercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        FileWriter file = new FileWriter("Conteúdo a ser gravado no arquivo.");
        file.write(nome);
        file.close();
    }
}
