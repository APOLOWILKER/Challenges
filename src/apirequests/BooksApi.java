package apirequests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BooksApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um livro para buscar: ");
        var tituloLivro = leitura.nextLine();

        String chave = "";
        String endereco ="https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());
    }
}