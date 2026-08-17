package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula4.Exercicio4;

import com.google.gson.Gson;

public class main {
    public static void main(String[] args) {
        Carro carro = new Carro("Tiguan", "preto", 129.999);

        Gson gson = new Gson();
        String json = gson.toJson(carro);
        System.out.println(json);
    }
}
