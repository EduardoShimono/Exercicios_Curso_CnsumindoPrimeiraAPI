package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula3.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite sua senha:");
        String senha = sc.nextLine();

        try{
            validarSenha(senha);
            System.out.println("Senha valida. Acesso permitido");
        }catch (SenhaInvalidaException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Senha deve ter pelo menos 8 caracteres.");
        }
    }
}
