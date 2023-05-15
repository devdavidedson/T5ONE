package br.com.alura.streammacth.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >=4 ) {
            System.out.println("Esta entre os preferidos");
        } else if (classificavel.getClassificacao() >= 2 ) {
            System.out.println("Bem avaliado!");
        } else {
            System.out.println("Salva nos favoritos para ver depois");
        }
    }
}
