package entrega;

public class cliente {

    public static void main(String[] args) {

        entregashopee joao = new entregashopee();
        joao.nome = "João";
        joao.rua = "Jose Sebastião boarder";
        joao.bairro = "Sion";
        joao.numero = 145;
        joao.referencia ="Casa de esquina";

        entregashopee maria = new entregashopee();
        maria.nome = "Maria";
        maria.rua = "Luís Pederiva";
        maria.bairro = "Parque boa vista";
        maria.numero = 52;
        maria.referencia ="Muro de cor marron";


        System.out.println(maria.rua);
    }

}
