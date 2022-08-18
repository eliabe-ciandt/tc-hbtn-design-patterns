public class NaveEspacialDecorator extends NaveEspacial {

    private NaveEspacial naveEspacialDecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        this.naveEspacialDecorada = naveEspacial;
    }

    @Override
    public int getSaude() {
        return naveEspacialDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveEspacialDecorada.getAtaque();
    }

}
