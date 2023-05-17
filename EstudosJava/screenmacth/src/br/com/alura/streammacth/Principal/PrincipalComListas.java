package br.com.alura.streammacth.Principal;

import br.com.alura.streammacth.modelos.Filme;
import br.com.alura.streammacth.modelos.Serie;
import br.com.alura.streammacth.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Milagre da cela 5", 2018);
        Filme filme2 = new Filme("Super Mario", 2023);
        Filme filme3 = new Filme("Guardiões da Galaxia III", 2023);
        Serie heros = new Serie("Heroes", 2006);
        filme1.somaDasAvaliacoes(8);
        filme2.somaDasAvaliacoes(10);
        filme3.somaDasAvaliacoes(6);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(heros);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //para chamar um metodo exclusivo de filme eu preciso declarar o instanceof
            if(item instanceof Filme filme /* && Aqui podemos colocar verificadores*/) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        //lista.forEach(item -> System.out.println(item.getNome()));
        //lista.forEach(System.out::println);
        
    }
}
