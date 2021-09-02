public  abstract class Conta {
    protected double saldo;
    private int agencia; // não pode ser negativo
    private int numero; // não pode ser negativo
    private static int totalContas;
    private Cliente titular;

    // Construtor de uma Conta Bancaria
    public Conta(int agencia, int numero) {
        Conta.totalContas++;
        System.out.println("Agora o total de contas cadastradas no Banco DAS eh: " + Conta.totalContas);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Mais uma conta foi criada com o numero "+ this.numero +" na agencia "+ this.agencia);
        System.out.println("----------");
    }

    // Metodos da classe para a manipulação do Saldo
    public void abstract deposita(double valor) {
        // Adiciona Saldo
//        this.saldo += valor;
//        System.out.println("Saldo adicionado a conta...");
//        System.out.println("O saldo agora eh de: R$" + this.saldo);
//        System.out.println("----------");
    }

    public boolean saca(double valor) {
        // Retira saldo
        if (valor < this.saldo) {  // Se o valor for inferior ao saldo presente na conta o usuario pode sacar o dinheiro
            this.saldo -= valor;
            System.out.println("Sacando R$" + valor + " da sua conta...");
            System.out.println("----------");
            return true;
        } else {
            System.out.println("Impossivel sacar esse valor da sua conta pois ele eh superior ao seu saldo");
            System.out.println("----------");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Tranferindo o valor de R$" + valor + " ...");
            System.out.println("----------");
            return true;
        }
        else {
            System.out.println("Impossivel tranferir o valor de R$" + valor + " pois ele é superior ao valor encontrado na sua conta");
            System.out.println("----------");
            return false;
        }

    }



    // Saldo do Cliente

    public double getSaldo() {
        return this.saldo;
    }

    // Agencia Bancaria

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Essa ação não pode ser executada, você escolheu um agência que não existe!");
            System.out.println("----------");
            return;
        }
        this.agencia = agencia;
    }

    // Número da conta no Banco

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Essa ação não pode ser executada, você escolheu um numero de conta negativo!");
            System.out.println("----------");
            return;
        }
        this.numero = numero;
    }


    // Titulares do banco

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalContas() {
        return Conta.totalContas;
    }
}


