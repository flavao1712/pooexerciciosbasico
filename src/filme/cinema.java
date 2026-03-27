package filme;

public class cinema {
    public static void main(String[] args) {

        filme destruicaoFinal = new filme();
        destruicaoFinal.nome = "Destruição Final 2";
        destruicaoFinal.genero = "Ação, Catástrofe";
        destruicaoFinal.lancamento = 2026;
        destruicaoFinal.produtora = "STX Entertainment";

        filme terremoto = new filme();
        terremoto.nome = "Terremoto";
        terremoto.genero = "Ação, Catástrofe, Drama";
        terremoto.lancamento = 2018;
        terremoto.produtora = "Amanda Award-People’s Amanda";

        System.out.println(destruicaoFinal.nome);
        System.out.println(terremoto.genero);
    }
}
