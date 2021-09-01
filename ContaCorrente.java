public class ContaCorrente extends Conta {
    String cartao;

    public boolean transfereSaldo(double valor, Conta destino) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Tranferindo o valor de R$" + valor + " ...");
            return true;
        }
        else {
            System.out.println("Impossivel tranferir o valor de R$" + valor + " pois ele é superior ao valor encontrado na sua conta");
            return false;
        }

    }
}