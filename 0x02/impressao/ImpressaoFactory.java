public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadeColoridas, boolean ehFrenteVerso) {
        return new Impressao(tamanhoImpressao, totalPaginas, quantidadeColoridas, ehFrenteVerso);
    }
}
