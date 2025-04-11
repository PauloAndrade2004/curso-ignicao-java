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

       setSaldo(getSaldo() - valor);

        // System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println("Saque de R$ " + valor + " realizado com sucesso ");
        //System.out.println("Saldo após o saque: R$ " + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso ");
        super.depositar(valor);
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