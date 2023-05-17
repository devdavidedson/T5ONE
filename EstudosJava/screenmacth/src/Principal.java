import br.com.alura.streammacth.calculos.CalculadoraDeTempo;
import br.com.alura.streammacth.calculos.FiltroRecomendacao;
import br.com.alura.streammacth.modelos.Episodios;
import br.com.alura.streammacth.modelos.Filme;
import br.com.alura.streammacth.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Objetos

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        //Filmes
           //Filme - 1
        Filme filme1 = new Filme("Milagre da cela 5", 2018);
        filme1.setDuracaoEmMinutos(185);
        filme1.setIncluidoNoPlano(true);

            //Filme - 2
        Filme filme2 = new Filme("Super Mario", 2023);
        filme2.setDuracaoEmMinutos(95);
        filme2.setIncluidoNoPlano(true);

            //filme - 3
        Filme filme3 = new Filme("Guardiões da Galaxia III", 2023);
        filme3.setDuracaoEmMinutos(185);
        filme3.setIncluidoNoPlano(false);

        //Series

            //Serie-1
        Serie heros = new Serie("Heroes", 2006);
        heros.setDuracaoEmMinutos(300);
        heros.setTemporadas(6);
        heros.setIncluidoNoPlano(true);
        heros.setEpisodiosPorTemporada(8);
        heros.setMinutosPorEpisodio(44);

        //Episodios
            //Episodio-1
        Episodios episodio = new Episodios();
        episodio.setNome("A Lua Sangrenta");
        episodio.setSerie(heros);
        episodio.setNumero(5);
        episodio.setTotalDeVisualizacoes(80);
        filtro.filtra(episodio);

        //chamadas

        filme1.exibirFichaTecnica();
        filme1.somaDasAvaliacoes(8);
        filme1.somaDasAvaliacoes(10);
        filme1.somaDasAvaliacoes(6);
        System.out.println("A nota do filme é: " + filme1.calcularMedia());
        System.out.println("Filme Avaliado por: " + filme1.getTotalDeAvaliacoes() + " usuários");

        heros.exibirFichaTecnica();
        System.out.println("Para maratorna leva: " + heros.getDuracaoEmMinutos() + " min");

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        filtro.filtra(filme1);

        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(2).getNome());

        System.out.println(listaDeFilmes);

    }
}
