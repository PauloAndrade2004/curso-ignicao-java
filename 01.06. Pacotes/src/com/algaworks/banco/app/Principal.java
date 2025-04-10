package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {

        System.out.println("\n============================================");
        System.out.println("Conta titular 1");
        System.out.println("============================================");
        // criando a com.algaworks.banco.modelo.Pessoa titular1.
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Gabrielle");
        titular1.setDocumento("5006361847");

        //Istanciando a classe com.algaworks.banco.modelo.Conta com o construtor sem argumento
        Conta contaTitular1 = new Conta(titular1, 666, 224, 1000);

        System.out.println("O tiular da conta é: " + contaTitular1.getTitular().getNome());
        System.out.println("Documento: " + titular1.getDocumento());
        System.out.println("Agencia: " + contaTitular1.getAgencia());
        System.out.println("Numero: " + contaTitular1.getNumero());
        System.out.println("Saldo atual: R$ " + contaTitular1.getSaldo());
        //Invocando os metodos
        contaTitular1.depositarDinhero(500);

        System.out.println("\n============================================");
        System.out.println("Conta titular 2");
        System.out.println("============================================");

        //Istanciando a classe com.algaworks.banco.modelo.Conta com o construtor com valor ja definidos.
        Pessoa titular2 = new Pessoa();
        titular2.setNome("Paulo");
        titular2.setDocumento("5006361847");

        Conta contaTitular2 = new Conta(titular2, 555, 124, 1000);
        System.out.println("O titular da conta e: " + contaTitular2.getTitular().getNome());
        System.out.println("Documento: " + titular2.getDocumento());
        System.out.println("Agencia: " + contaTitular2.getAgencia());
        System.out.println("Numero: " + contaTitular2.getNumero());
        System.out.println("Saldo inicial sem alteracao: R$ " + contaTitular2.getSaldo());
        //Invocando o metodo de depositar na contaTitulae2
        contaTitular2.depositarDinhero(500);
        contaTitular2.sacarDinheiro(500);



    }

}
