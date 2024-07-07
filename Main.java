public class Main {
    public static void main(String[] args) {
        //Criando uma instancia da classe Contz
        Conta minhaConta = new Conta("Akira", 12345);

        //Realizando operações na conta
        minhaConta.depositar(1000.0);
        minhaConta.sacar(200.0);

        //Imprimindo informações da conta
        System.out.println("Nome da conta: " + minhaConta.getNome());
        System.out.println("Número da conta: " + minhaConta.getNumero());
        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
    }
}
