package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula4.Exercicios2e3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("matrix", "filme de tecnologia", 010);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
