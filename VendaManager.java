public class VendaManager {
    public double calcularVenda(double precoDiaria, int numeroDeDiarias) {
        return precoDiaria * numeroDeDiarias;
    }

    public double aplicarDesconto(double valorTotal, double percentualDesconto) {
        return valorTotal - (valorTotal * percentualDesconto / 100);
    }
}
