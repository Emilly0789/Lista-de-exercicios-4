public class Cartaocredito extends Pagamento {

    private static final double TAXA_ADMINISTRACAO = 0.03; // 3%

    @Override
    public void processar(double valor) {
        double valorFinal = valor + (valor * TAXA_ADMINISTRACAO);
        exibirResultado("Cartão de Crédito", valor, valorFinal);
    }
}
