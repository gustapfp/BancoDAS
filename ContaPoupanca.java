
public class ContaPoupanca extends Conta {
    double rendimentoConta;

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }
    @Override
    public void deposita(double valor) {
        // Adiciona Saldo
        super.saldo = this.saldo + valor;
        System.out.println("Saldo adicionado a conta...");
        System.out.println("O saldo agora eh de: R$" + this.saldo);
        System.out.println("----------");
    }

}