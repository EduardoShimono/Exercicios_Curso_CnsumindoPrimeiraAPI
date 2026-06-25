package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula1.exercicio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o livro que deseja consultar: ");
        var busca = sc.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=AIzaSyDzfBkIjxG55KxxPOdFK4-yQ83jnzQdAnQ";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
