class BancoDAS {
    double saldo;
    int numero;
    int agencia;
    String titular;
}

class ContaCorrente extends BancoDAS {
    String cartao;
}

class ContaPoupanca extends BancoDAS {
    double rendimentoConta;
}