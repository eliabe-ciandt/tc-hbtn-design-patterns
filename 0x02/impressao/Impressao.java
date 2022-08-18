public class Impressao {

    private TamanhoImpressao tamanhoImpressao;
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal() {

        double valorPB = 0;
        double valorCor = 0;
        double valorTotal = 0;

        if(tamanhoImpressao == TamanhoImpressao.A2) {
            valorPB = (ehFrenteVerso) ? .18 : .22;
            valorCor = (ehFrenteVerso) ? .28 : .32;
        }

        if(tamanhoImpressao == TamanhoImpressao.A3) {
            valorPB = (ehFrenteVerso) ? .15 : .2;
            valorCor = (ehFrenteVerso) ? .25 : .3;
        }

        if(tamanhoImpressao == TamanhoImpressao.A4) {
            valorPB = (ehFrenteVerso) ? .1 : .15;
            valorCor = (ehFrenteVerso) ? .2 : .25;
        }

        valorTotal = valorCor * getPaginasColoridas() + valorPB * getPaginasPB();

        return valorTotal;

    }


    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public int getPaginasPB() {
        return paginasTotais - paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    @Override
    public String toString() {
        return String.format("  total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                getPaginasTotais(),
                getPaginasColoridas(),
                getPaginasPB(),
                (ehFrenteVerso) ? "frente e verso" : "frente apenas",
                calcularTotal());
    }
}
