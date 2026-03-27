package funcionario;

public class empresa {
    public static void main(String[] args) {

        funcionario carlos = new funcionario();
        carlos.nome = "Carlos";
        carlos.id = 1547;
        carlos.cracha = true;
        carlos.idade = 30;


        funcionario fernanda = new funcionario();
        fernanda.nome = "Fernanda";
        fernanda.id = 7894;
        fernanda.cracha = true;
        fernanda.idade = 25;

        System.out.println(fernanda.id);
        System.out.println(carlos.id);
    }
}
