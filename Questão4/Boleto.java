public class Boleto extends Pagamento {

    private static final double TAXA_EMISSAO = 2.50; // valor fixo

    @Override
    public void processar(double valor) {
        double valorFinal = valor + TAXA_EMISSAO;
        exibirResultado("Boleto", valor, valorFinal);
    }
}
