package br.com.gpr.screenmatch.calculo;

import br.com.gpr.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo t){
        System.out.println("Adicionando duração em minutos de " + t);
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
