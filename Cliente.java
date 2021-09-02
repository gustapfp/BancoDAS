public class Cliente implements Autenticavel {
    private String nome;
    private String cpf;
    private String endereco;
    private int senha;

    // CPF do cliente
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // Endereço do Cliente
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    // Nome do Cliente
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodos da Herança

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentifica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }
}