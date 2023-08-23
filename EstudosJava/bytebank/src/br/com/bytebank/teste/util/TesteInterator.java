package br.com.bytebank.teste.util;

import java.util.*;

public class TesteInterator {
    public static void main(String[] args) {

        /*List<String> nomes = new ArrayList<>();
        nomes.add("Miguel");
        nomes.add("Ana Ive");
        nomes.add("Dayanne");
        nomes.add("David");

        Collections.shuffle(nomes); //Para deixar a Lista Aleatória

        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        //Set e HashSet implementados abaixo

        Set<String> nomes = new HashSet<>();
        nomes.add("Miguel");
        nomes.add("Ana Ive");
        nomes.add("Dayanne");
        nomes.add("David");

        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
