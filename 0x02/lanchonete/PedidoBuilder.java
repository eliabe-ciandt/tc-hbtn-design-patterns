public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido = new Pedido();

    @Override
    void setLanche(TipoLanche tipo) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.LANCHE, tipo.toString());
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.BATATA, tamanho.toString());
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.BRINDE, tipo.toString());
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBebida(TipoBebida tipo) {
        ItemPedido itemPedido = new ItemPedido(TipoItemPedido.BEBIDA, tipo.toString());
        pedido.adicionarItemForaCaixa(itemPedido);
    }

    public Pedido build() {
        return pedido;
    }
}
