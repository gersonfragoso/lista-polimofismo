package org.example.Exercicio5.empresa;

import org.example.Exercicio5.comissao.interfaces.Comissao;
import org.example.Exercicio5.comissao.model.ComissaoGerente;
import org.example.Exercicio5.comissao.model.ComissaoSupervisor;
import org.example.Exercicio5.comissao.model.ComissaoVendedor;
import org.example.Exercicio5.model.Funcionario;
import org.example.Exercicio5.model.FuncionarioBasico;
import org.example.Exercicio5.model.FuncionarioGraduado;
import org.example.Exercicio5.model.FuncionarioMedio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public void TestarEmpresa(){
        // Criar o array de funcionários
        Funcionario[] funcionarios = new Funcionario[10];

        // Definir comissões
        Comissao gerenteComissao = new ComissaoGerente();
        Comissao supervisorComissao = new ComissaoSupervisor();
        Comissao vendedorComissao = new ComissaoVendedor();

        // Criar funcionários como Gerentes
        funcionarios[0] = new FuncionarioGraduado("Fernanda", "F009", "Escola Municipal I", "Escola Estadual E", "Universidade XYZ", gerenteComissao);

        // Criar funcionários como Supervisores
        funcionarios[1] = new FuncionarioMedio("Carlos", "F005", "Escola Municipal E", "Escola Estadual A", supervisorComissao);
        funcionarios[2] = new FuncionarioMedio("Julia", "F006", "Escola Municipal F", "Escola Estadual B", supervisorComissao);

        // Criar funcionários como Vendedores
        funcionarios[3] = new FuncionarioBasico("João", "F001", "Escola Municipal A", vendedorComissao);
        funcionarios[4] = new FuncionarioBasico("Maria", "F002", "Escola Municipal B", vendedorComissao);
        funcionarios[5] = new FuncionarioBasico("Pedro", "F003", "Escola Municipal C", vendedorComissao);
        funcionarios[6] = new FuncionarioBasico("Ana", "F004", "Escola Municipal D", vendedorComissao);
        funcionarios[7] = new FuncionarioBasico("Lucas", "F007", "Escola Municipal G", vendedorComissao);
        funcionarios[8] = new FuncionarioBasico("Sofia", "F008", "Escola Municipal H", vendedorComissao);
        funcionarios[9] = new FuncionarioBasico("Bruno", "F010", "Escola Municipal J", vendedorComissao);

        // Calculando os custos
        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoNivelSuperior = 0;


        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRendaTotal();
            custoTotal += renda;

            if (funcionario instanceof FuncionarioGraduado) {
                custoNivelSuperior += renda;
            } else if (funcionario instanceof FuncionarioMedio) {
                custoEnsinoMedio += renda;
            } else if (funcionario instanceof FuncionarioBasico) {
                custoEnsinoBasico += renda;
            }
        }

        // Exibindo os resultados
        System.out.println("------ Exibindo custo ------");
        System.out.println("Custo total da empresa com salários: R$ " + custoTotal);
        System.out.println("Custo com funcionários de Ensino Básico: R$ " + custoEnsinoBasico);
        System.out.println("Custo com funcionários de Ensino Médio: R$ " + custoEnsinoMedio);
        System.out.println("Custo com funcionários de Nível Superior: R$ " + custoNivelSuperior);
        System.out.println();
        System.out.println("------ Exibindo funcionarios ------");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
}

