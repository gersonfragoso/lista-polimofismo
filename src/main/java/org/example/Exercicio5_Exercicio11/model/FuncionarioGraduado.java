package org.example.Exercicio5_Exercicio11.model;

import org.example.Exercicio5_Exercicio11.comissao.interfaces.Comissao;

public class FuncionarioGraduado extends FuncionarioMedio{
    private String universidade;

    public FuncionarioGraduado(String nome, String codigoFuncional, String ensinoBasico, String ensinoMedio, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, ensinoBasico, ensinoMedio, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public double calcularRenda(){
        double renda = super.calcularRenda();
        renda+=renda;
        return renda;
    }
    @Override
    public double calcularRendaTotal() {
        double renda = calcularRenda();
        renda +=  getComissao().getComissao();
        super.setSalarioTotal(renda);
        return renda;
    }
}
