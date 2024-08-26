package org.example.Exercicio5_Exercicio11.comissao.model;


import org.example.Exercicio5_Exercicio11.comissao.interfaces.Comissao;

public class ComissaoGerente implements Comissao {
    @Override
    public double getComissao() {
        return 1500.0;
    }
}