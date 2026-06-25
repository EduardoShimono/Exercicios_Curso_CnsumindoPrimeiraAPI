package br.com.alura.curso.consumindoUmaAPI.exercicios.Aula1.exercicio2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a criptomoeda que deseja consultar: ");
        var criptomoeda = sc.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=BRL&ids=" + criptomoeda + "&x_cg_demo_api_key=CG-YFsZFMB8XGE6vNQkk4rkdxHR";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
