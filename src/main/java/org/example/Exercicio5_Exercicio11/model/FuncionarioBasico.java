package org.example.Exercicio5_Exercicio11.model;

import org.example.Exercicio5_Exercicio11.comissao.interfaces.Comissao;

public class FuncionarioBasico extends Funcionario{
    private String ensinoBasico;
    public FuncionarioBasico(String nome, String codigoFuncional, String ensinoBasico, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.ensinoBasico = ensinoBasico;
    }

    public String getEnsinoBasico() {
        return ensinoBasico;
    }

    public void setEnsinoBasico(String ensinoBasico) {
        this.ensinoBasico = ensinoBasico;
    }

    public double calcularRenda(){
        double renda = getSalarioBase();
        return renda + renda * 0.10;
    }

    @Override
    public double calcularRendaTotal() {
        double renda = calcularRenda();
        renda += getComissao().getComissao();
        super.setSalarioTotal(renda);
        return renda;
    }
}
