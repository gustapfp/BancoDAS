public class Conta {
    private double saldo;
    private int agencia; // não pode ser negativo
    private int numero; // não pode ser negativo
    private Cliente titular;

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

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    // Número da conta no Banco
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero
    }
    // Titulares do banco
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}
