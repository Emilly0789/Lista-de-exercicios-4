public abstract class Pagamento {

    public abstract void processar(double valor);

    protected void exibirResultado(String forma, double valorOriginal, double valorFinal) {
        System.out.printf("[%s] Valor original: R$ %.2f | Valor final: R$ %.2f%n",
                forma, valorOriginal, valorFinal);
    }
}
