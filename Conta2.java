public class Conta2 {
    private String nome1;
    private int numero1;
    private double saldo1;

    public Conta2(String nome1, int numero1) {
        this.nome1 = nome1;
        this.numero1 = numero1;
        this.saldo1 = 0.0; // pode mudar o saldo se quiser
    }

    public String getNome1() {
        return nome1;
    }

    public int getNumero1() {
        return numero1;
    }

    public double getSaldo1() {
        return saldo1;
    }

    public void depositar1(double valor1) {
        if (valor1 > 0) {
            saldo1 += valor1;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    
    public void sacar1(double valor1) {
        if (valor1 > 0 && valor1 <= saldo1) {
            saldo1 -= valor1;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

}
