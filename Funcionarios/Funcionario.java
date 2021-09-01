public class Funcionario {
    private String nome;
    private String cpf;
    protected double Salario;


    public double getBonificacao() {

        if(this.tipo == 0) { // Funcionário comum;
            return this.salario * 0.1;
        } else if(this.tipo == 1) { // Gerente;
            return this.salario;
        } else {
            return this.salario + 1000.0;
        }

    }



    // Nome

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    // CPF

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    // Salario

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getSalario() {
        return Salario;
    }
}


