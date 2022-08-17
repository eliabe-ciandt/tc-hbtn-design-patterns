public class Mago extends Personagem{

    public Mago(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome,TipoPersonagem.MAGO, inteligencia, forca, vigor, resistencia, destreza);
        if(inteligencia <= forca || inteligencia <= destreza) {
            throw new IllegalArgumentException("Atributos invalidos para MAGO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (this.getForca() * 0.05) + (getInteligencia() * 0.8) + (getDestreza() * 0.05) + (getVigor() * 0.1);
    }
}
