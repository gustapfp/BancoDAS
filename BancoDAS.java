public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Saldo adicionado a conta...");
        System.out.println("O saldo agoora eh de: R$" + this.saldo);
    }

    public boolean saca(double valor) {
        if(valor < this.saldo)  {  // Se o valor for inferior ao saldo presente na conta o usuario pode sacar o dinheiro
            this.saldo -= valor;
            System.out.println("Sacando R$" + valor + " da sua conta...");
            return true;
        }
        else if(valor < 0) {
            System.out.println("Você inseriou um valor invalido para sacar");
            return false;

        }
        else {
            System.out.println("Impossivel sacar esse valor da sua conta pois ele eh superior ao seu saldo");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
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

class ContaCorrente extends BancoDAS {
    String cartao;
}

class ContaPoupanca extends BancoDAS {
    double rendimentoConta;
}