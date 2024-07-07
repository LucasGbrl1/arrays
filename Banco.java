public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new Conta[1];
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void adicionarConta(Conta conta) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] == null) {
                contas[i] = conta;
                System.out.println("Conta adicionada com sucesso!");
                return;
            }
        }
        System.out.println("Não foi possível adicionar a conta. Limite de contas atingido.");
    }

}
