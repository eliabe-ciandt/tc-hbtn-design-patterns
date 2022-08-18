import java.util.List;

public class BebidaDecorator extends Bebida{

    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }

    @Override
    public List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return bebidaDecorada.obterPreco();
    }
}
