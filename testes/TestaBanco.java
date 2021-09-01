public class TestaBanco {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        Cliente theo = new Cliente();

        gustavo.nome = "Gustavo Figueiredo";
        theo.nome = "Theo Gomes";

        gustavo.cpf = "111.555.777-33";
        theo.cpf = "333.222.777-88";

        gustavo.endereco = "Floranopolis, SC";
        theo.endereco = "Vitoria, ES";

        Conta contaGustavo = new ContaCorrente();
        contaGustavo.titular = Gustavo
        Conta contaTheo = new ContaCorrente();
        contaTheo.titular = theo

        contaGustavo.depositaSaldo(500);
        contaTheo.depositaSaldo(800);
    }
}