package Produto;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto01 = new Produto("Pão", 1.00, 5);
        Produto produto02 = new Produto("Queijo", 30, 1);

        listaProdutos.add(produto01);
        listaProdutos.add(produto02);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

    }
}
