import java.text.NumberFormat;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        Produto bigmac = new Produto("BigMac", "sanduiche", "Único", 18.0);
        Produto fritas = new Produto("MacFritas", "batata frita", "Média", 5.0);
        Produto salada = new Produto();
        Produto refrigerante = new Produto("Coca-cola", "refrigerante", "Grande", 9.00);

        System.out.println("Produto 1: " + bigmac.getNome());
        System.out.println("Produto 2: " + fritas.getNome());
        System.out.println("Produto 3: " + salada.getNome());

        double valorTotal = bigmac.getValor() + fritas.getValor() + refrigerante.getValor();
        System.out.println("Valor: " + NumberFormat.getCurrencyInstance(Locale.US).format(valorTotal * 0.9));
    }
}
