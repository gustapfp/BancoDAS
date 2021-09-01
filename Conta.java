public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void depositaSaldo(double valor) {
        this.saldo += valor;
        System.out.println("Saldo adicionado a conta...");
        System.out.println("O saldo agora eh de: R$" + this.saldo);
    }

    public boolean sacaSaldo(double valor) {
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
}
