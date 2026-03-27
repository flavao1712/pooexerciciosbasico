package aluno;

public class escola {
    public static void main(String[] args) {

        aluno felipe = new aluno();
        felipe.nome = "Felipe";
        felipe.cor = "Branca";
        felipe.idade = 16;
        felipe.altura = 1.65;

        aluno ana = new aluno();
        ana.nome = "Ana";
        ana.cor = "parda";
        ana.idade = 16;
        ana.altura = 1.65;

        System.out.println(ana.altura + " " + ana.nome);
        System.out.println(felipe.altura + " " + felipe.nome);

    }
}