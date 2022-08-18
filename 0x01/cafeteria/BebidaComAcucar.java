import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    public BebidaComAcucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> bebidaComAcucar = new ArrayList<>();
        bebidaComAcucar.addAll(super.obterIngredientes());
        bebidaComAcucar.add("acucar");

        return bebidaComAcucar;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
