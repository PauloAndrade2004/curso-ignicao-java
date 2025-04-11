package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.ContaCorrente;
import com.algaworks.banco.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {

        System.out.println("============================================");
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Gabrielle");
        titular1.setDocumento("50063614847");

        ContaCorrente contaPaulo = new ContaCorrente(titular1, 555, 55,1000);
        System.out.println(contaPaulo); //chamando o toString, da classe ContaCorrente
        contaPaulo.depositarDinhero(500);
        contaPaulo.sacarDinheiro(500);
        System.out.println("============================================");

        System.out.println("\n============================================");
        Pessoa titular2 = new Pessoa();
        titular2.setNome("Paulo");
        titular2.setDocumento("50063614847");

        ContaCorrente contaGabrielle = new ContaCorrente(titular2, 666, 224, 1000);
        System.out.println(contaGabrielle); //chamando o toString, da classe ContaCorrente
        contaGabrielle.sacarDinheiro(500);
        System.out.println("============================================");



    }

}
