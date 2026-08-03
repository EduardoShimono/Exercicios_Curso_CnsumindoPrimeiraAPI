package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula3.exercicio2;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
