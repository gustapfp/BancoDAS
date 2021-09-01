public class CriaConta {
    public static void main(String[] args) {
        Conta contaGustavo = new ContaCorrente();
        Conta contaTheo = new ContaCorrente();
        contaTheo.saldo = 10000.0;
        contaGustavo.saldo = 1000.0;
        contaGustavo.agencia = 103;
        contaGustavo.numero = 48792;
        contaGustavo.titular = "Gustavo Figueiredo";
        System.out.println("A conta do titular " + contaGustavo.titular + " tem o numero: " +
                contaGustavo.numero + " referente a agencia: " + contaGustavo.agencia + " com o saldo de: R$" + contaGustavo.saldo + '.');
        contaGustavo.depositaSaldo(50);
        // contaGustavo.saca(100);
        // contaGustavo.saca(-1);
        // contaGustavo.saca(10000);

        boolean conseguiuRetirar = contaGustavo.sacaSaldo(150);
        contaGustavo.transfereSaldo(200.0, contaTheo);
    }
}