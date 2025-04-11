package com.algaworks.banco.modelo;

public abstract class Conta {

    private Pessoa titular; // Composição
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Pessoa titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Método concreto para saque
    public void sacar(double valor) {
        if (valor > saldo || valor <= 0) {
            throw new IllegalArgumentException("O valor do saque é inválido.");
        }
        this.saldo -= valor;
        //System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }

    // Método concreto para depósito
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldo += valor;

    }

    // Getters e Setters
    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular.getNome() +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}