package org.example.Exercicio5.comissao.model;

import org.example.Exercicio5.comissao.interfaces.Comissao;

public class ComissaoVendedor implements Comissao {
    @Override
    public double getComissao() {
        return 250.0;
    }
}