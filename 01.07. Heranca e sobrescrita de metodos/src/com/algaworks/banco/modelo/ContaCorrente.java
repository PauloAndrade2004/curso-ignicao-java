package com.algaworks.banco.modelo;

public class ContaCorrente extends Conta {

    // Criando construtor
    public ContaCorrente(Pessoa titular, int agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo() || valor <= 0) {
            throw new IllegalArgumentException("O valor do saque é inválido.");
        }
        // Adicionando uma taxa de saque específica para ContaCorrente
        double taxa = 0.10; // Exemplo de taxa fixa
        double valorComTaxa = valor + taxa;

        if (valorComTaxa > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para cobrir o saque e a taxa.");
        }

        setSaldo(getSaldo() - valorComTaxa);
        System.out.println("Saque de R$ " + valor + " realizado com sucesso (taxa de R$ " + taxa + " aplicada).");
        System.out.println("Saldo após o saque: R$ " + getSaldo());
    }

    @Override
    public String toString() {
        return "ContaCorrente {" +
                "titular = " + getTitular().getNome() +
                ", agencia = " + getAgencia() +
                ", numero = " + getNumero() +
                ", saldo = " + getSaldo() +
                '}';
    }
}