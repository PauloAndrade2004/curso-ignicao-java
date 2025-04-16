package PrimeiraClasse;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Smartphones";
        p.precoUnitario = 1500;
        p.quantidade = 10;

        exibirQuantidadeEmEstoque(p);

    }

    static void exibirQuantidadeEmEstoque(Produto produto) {
        String mensagem = String.format("Quantidade em estoque do produto é de: %d %s", produto.quantidade, produto.nome);
        String mensagem2 = ("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade);
        System.out.println(mensagem);
    }

    // Criamos uma classe Produto, adicionamos atributos a ela.
    // Criamos o Objeto produto, adicionamos.
    // definimos nome, precoUnitario e quantidade.

    // criamos um metodo chamado: exibirQuantidadeEmEstoque()
    // Que recebe como parâmetro um objeto do tipo (Produto)
    //Será necessário passar um (Produto) como argumento


}
