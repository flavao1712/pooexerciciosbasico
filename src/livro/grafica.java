package livro;

public class grafica {
    public static void main(String[] args) {

        livro guerra = new livro();
        guerra.titulo = "A arte da guerra";
        guerra.capa = "Capa dura";
        guerra.editora = "Garnier";
        guerra.quantidadeDePagina = 89;


        livro mente  = new livro();
        mente.titulo = "Mais Esperto que o Diabo";
        mente.capa = "Capa dura";
        mente.editora = "Citadel";
        mente.quantidadeDePagina = 210;


        System.out.println(mente.titulo);
        System.out.println(guerra.titulo);


    }
}
