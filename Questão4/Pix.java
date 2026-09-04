public class Pix extends Pagamento {

    private static final double DESCONTO = 0.05; // 5%

    @Override
    public void processar(double valor) {
        double valorFinal = valor - (valor * DESCONTO);
        exibirResultado("Pix", valor, valorFinal);
    }
}
