public class Conta {
    private String nome;
    private int numero;
    private double saldo;

    public Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0.0; // pode mudar o saldo se quiser
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

}
