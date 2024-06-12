package titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        int numero01 = 33;
        int numero02 = 58;
        int numero04 = 01;
        numeros.add(numero01);
        numeros.add(numero02);
        numeros.add(numero04);

        System.out.println(numeros);
        Collections.sort(numeros);

        System.out.println(numeros);

        List<Titulo> pessoas = new LinkedList<>();
        Titulo pessoa01 = new Titulo("Apolo");
        Titulo pessoa02 = new Titulo("Dayane");
        Titulo pessoa03 = new Titulo("Onix");
        pessoas.add(pessoa01);
        pessoas.add(pessoa02);
        pessoas.add(pessoa03);

        Collections.sort(pessoas);

        for (Titulo titulo : pessoas){
            System.out.println(titulo.nome);
        }


    }
}
