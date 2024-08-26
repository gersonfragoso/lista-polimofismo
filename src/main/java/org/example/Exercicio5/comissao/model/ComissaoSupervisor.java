package org.example.Exercicio5.comissao.model;

import org.example.Exercicio5.comissao.interfaces.Comissao;

public class ComissaoSupervisor implements Comissao {
    @Override
    public double getComissao() {
        return 600.0;
    }
}
