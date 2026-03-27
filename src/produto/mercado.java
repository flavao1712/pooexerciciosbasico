package produto;

public class mercado {
    public static void main(String[] args) {


        produtos chocolate = new produtos();
        chocolate.nome = "Snickers";
        chocolate.cor = "Marrom";
        chocolate.tipo = "Bombom";
        chocolate.dataDeValidade = "19/10/26";

        produtos sabao = new produtos();
        sabao.nome = "Ypé";
        sabao.cor = "Verde";
        sabao.tipo = "Limpeza";
        sabao.dataDeValidade = "25/9/26";

        System.out.println(sabao.nome);
        System.out.println(chocolate.nome);

    }

}
