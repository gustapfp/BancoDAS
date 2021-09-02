public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(13235, 777);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(45218, 777);
        cp.deposita(500);

        cc.transfere(50, cp);

        cc.saca(10);

        System.out.println("----------");
        System.out.println("Saldo CP: " + cp.getSaldo() + " | Saldo CC: " + cc.getSaldo());

    }

}