import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{
    @Override
    List<String> obterIngredientes() {
        List<String> lista = new ArrayList<String>();
        lista.add("cafe");

        return lista;
    }

    @Override
    double obterPreco() {
        return 5.35;
    }
}
