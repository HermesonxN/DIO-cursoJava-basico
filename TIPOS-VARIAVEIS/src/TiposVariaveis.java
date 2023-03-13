public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Forma errada de escrever
        //double salarioMinimo = 2.500;

        //Forma certa
        double salarioMinimo = 2500;
        short numeroCurto = 1;

        //Convertendo short em int
        int numeroNormal = numeroCurto;

        //Convertendo int em short
        short numeroCurto2 = (short) numeroNormal;

        //Mudando valores de variaveis
        int numero = 1;
        numero = 2;

        //Variaveis que nunca podem ser mudadas, são escrita com final no inicio e em capslock
        final double PI = 3.14;
        final String NOME = "Hermeson";

        System.out.println(PI);
        System.out.println(NOME);
    }
}
