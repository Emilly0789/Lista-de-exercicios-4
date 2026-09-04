import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new Cartaocredito());
        pagamentos.add(new Boleto());
        pagamentos.add(new Pix());

        double valorCompra = 200.00;

        // Polimorfismo: cada objeto executa sua própria versão de processar()
        for (Pagamento pagamento : pagamentos) {
            pagamento.processar(valorCompra);
        }
    }
}
