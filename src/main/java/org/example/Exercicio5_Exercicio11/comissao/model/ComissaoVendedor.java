package org.example.Exercicio5_Exercicio11.comissao.model;

import org.example.Exercicio5_Exercicio11.comissao.interfaces.Comissao;

public class ComissaoVendedor implements Comissao {
    @Override
    public double getComissao() {
        return 250.0;
    }
}