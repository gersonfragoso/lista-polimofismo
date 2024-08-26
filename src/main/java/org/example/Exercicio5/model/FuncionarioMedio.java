package org.example.Exercicio5.model;

import org.example.Exercicio5.comissao.interfaces.Comissao;

public class FuncionarioMedio extends FuncionarioBasico{

    private String ensinoMedio;

    public FuncionarioMedio(String nome, String codigoFuncional, String ensinoBasico, String ensinoMedio, Comissao comissao) {
        super(nome, codigoFuncional, ensinoBasico, comissao);
        this.ensinoMedio = ensinoMedio;
    }

    public String getEnsinoMedio() {
        return ensinoMedio;
    }

    public void setEnsinoMedio(String ensinoMedio) {
        this.ensinoMedio = ensinoMedio;
    }
    public double calcularRenda(){
        double renda = super.calcularRenda();
        renda += renda * 0.50;
        return renda;
    }
    @Override
    public double calcularRendaTotal() {
        double renda = calcularRenda();
        renda += getComissao().getComissao();
        super.setSalarioTotal(renda);
        return renda;
    }
}
