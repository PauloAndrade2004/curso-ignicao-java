package com.algaworks.banco.modelo;

public class ContaInvestimento extends Conta {

    private double valorInvestido;

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public ContaInvestimento(Pessoa titular, int agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }

    public void aplicaRendimento(ContaCorrente contaCorrente, double valor) {
        if (valor > contaCorrente.getSaldo()) {
            throw new IllegalArgumentException("O valor de investimento nao valido.");
        }

        contaCorrente.sacar(valor);
        this.depositar(valor);
        this.valorInvestido += valor;
        System.out.println("Rendimento de R$ " + valor + " aplicado com sucesso.");

    }

    public double calcularRendimento() {
        double taxa = 0.05;
        return valorInvestido * taxa;
    }

}
