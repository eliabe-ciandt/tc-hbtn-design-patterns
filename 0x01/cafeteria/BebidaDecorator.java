import java.util.List;

public class BebidaDecorator extends Bebida{

    private Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public List<String> obterIngredientes() {
        return bebida.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return bebida.obterPreco();
    }
}
