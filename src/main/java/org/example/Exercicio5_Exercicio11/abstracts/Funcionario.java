package org.example.Exercicio5_Exercicio11.abstracts;

import org.example.Exercicio5_Exercicio11.comissao.interfaces.Comissao;

public abstract class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double salarioBase = 1000.0;
    private Comissao comissao;
    private double salarioTotal = 0;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        return salarioBase ;
    }

    @Override
    public String toString() {
        return "Funcionario: \n" +
                "Nome= " + nome +
                " , Comissão = "+ this.getComissao().getComissao() +
                " , Salario total=  "+ salarioTotal;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
}
