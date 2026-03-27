package carro;

public class tiposDeCarro {
    public static void main(String[] args) {

        toyota corolla = new toyota();
        corolla.modelo = "Corolla";
        corolla.cor = "Branca";
        corolla.ano = 2026;
        corolla.motorizacao = "Hibrido";


        toyota hiluxCabineDupla = new toyota();
        hiluxCabineDupla.modelo = "Hilux Cabine Dubla";
        hiluxCabineDupla.cor = "Preta";
        hiluxCabineDupla.ano = 2026;
        hiluxCabineDupla.motorizacao = "Diesel";


        System.out.println(corolla.modelo);
        System.out.println(hiluxCabineDupla.modelo);


    }
}
