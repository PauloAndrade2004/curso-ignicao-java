import java.util.Objects;

public class Conta {

    private Pessoa titular;// estamos usando a composição
    private int agencia;
    private int numero;
    private double saldo;

//    public Conta() {
//        //Construtor Vazio
//    }

    public Conta(Pessoa titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //como implementar um metodo na classe?
    public void depositarDinhero(double valor /*Variavel local (valor) */) {
        if (valor <= 0) {
            throw  new IllegalArgumentException("Valor para deposito deve ser maior que zero");
        }
        saldo += valor;
        //Quando eu utilizar o metodo depositarDinheiro, as mensagens que escrevi irão ser exibidas.
        System.out.println("Deposito realizado com sucesso, no valor de: " + valor);
        System.out.println("Saldo apos o deposito: R$ " + saldo);

    }

    public void sacarDinheiro(double valor) {
        if (valor <=saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }else {
            System.out.println("Valor solicitado e insuficiente");
        }

        System.out.println("Saldo final apos a realizacao do saque: R$ " + saldo);
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





}

