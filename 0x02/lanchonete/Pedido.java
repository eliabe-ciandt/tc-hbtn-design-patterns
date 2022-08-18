import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String itensFora = "Fora da caixa:";
        String itensDentro = "Dentro da caixa:";

        for(ItemPedido itemPedido: itensDentroCaixa) {
            itensDentro += "\n        - " +itemPedido.getTipo() + " " + itemPedido.getNome();
        }

        for(ItemPedido itemPedido: itensForaCaixa) {
            itensFora += "\n        - " +itemPedido.getTipo() + " " + itemPedido.getNome();
        }

        return itensFora + "\n" + itensDentro + "\n";
    }
}