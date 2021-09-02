public class ContaCorrente extends Conta implements Tributavel {
    String cartao;

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }


    @Override
    public boolean saca(double valor) {
        double taxaSaque = 1;
        double valorASacar = valor + taxaSaque;
        return super.saca(valorASacar);
    }
    @Override
    public void abstract deposita(double valor) {
        // Adiciona Saldo
        super.saldo = this.saldo + valor;
        System.out.println("Saldo adicionado a conta...");
        System.out.println("O saldo agora eh de: R$" + this.saldo);
        System.out.println("----------");
    }

     @Override
    public double getValorImposto() {
        return super.saldo * 0.05;
     }





}