public class ControleBonificacao {
    private double somaBonificacao;

    public void registra(Funcionario f) {
        double bonificacaoFuncionario = f.getBonificacao();
        this.soma = this.soma + bonificacaoFuncionario;

    }

    // Retorno do somatorio de Bonificação

    public double getSomaBonificacao() {
        return somaBonificacao;
    }

    public double getBonificacao() {
        System.out.println("Chamando o método bonificacao do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }
}