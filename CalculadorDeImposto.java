public class CalculadorDeImposto {
    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}