import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> bebidaComLeite = new ArrayList<>();
        bebidaComLeite.addAll(super.obterIngredientes());
        bebidaComLeite.add("leite");

        return bebidaComLeite;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
