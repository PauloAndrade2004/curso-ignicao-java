package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;

public class Principal {
    public static void main(String[] args) {
        // 1. Criar uma pessoa
        Pessoa contaPaulo = new Pessoa();
        contaPaulo.setNome("Joao");
        contaPaulo.setDocumento("12345678901");

        // 2. Criar ContaCorrente com saldo inicial
        ContaCorrente contaCorrente = new ContaCorrente(contaPaulo, 123, 1001, 1000.0);
        System.out.println(contaCorrente.toString());
        contaCorrente.depositar(1000.0);
        contaCorrente.sacar(1000.0);


        // 3. Criar ContaInvestimento com saldo inicial zero
        //ContaInvestimento contaInvestimento = new ContaInvestimento(contaPaulo, 123, 2001, 0.0);

        // 4. Aplicar investimento de R$ 500,00
        //contaInvestimento.aplicaRendimento(contaCorrente, 500.0);

        // 5. Calcular o rendimento (5% sobre valor investido)
        //double rendimento = contaInvestimento.calcularRendimento();

        // 6. Mostrar os resultados
        System.out.println("\n==================== RESUMO ====================");
        System.out.println("Titular: " + contaPaulo.getNome());
        System.out.println("Saldo da Conta Corrente: R$ " + contaCorrente.getSaldo());

    }
}
