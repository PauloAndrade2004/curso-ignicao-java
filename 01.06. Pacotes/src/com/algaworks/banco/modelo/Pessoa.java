package com.algaworks.banco.modelo;

public class Pessoa {

    private String nome;
    private String documento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        //Podemos adicionar alguma lógica dentro do setter.
        //Se documento não for (null) e o documento for igual a 11, esse código e executado.
        if ( documento != null && documento.length() == 11) {
            this.documento = documento;
        }else {
            System.out.println("O documento deve conter 11 digitos");
        }

    }
}
