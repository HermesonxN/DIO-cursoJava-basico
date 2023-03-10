public class OperadoresRelacionais {
    public static void main(String[] args) {
        //Testando em valores numericos(int)
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1==numero2;
        System.out.println("Numero 1 sera igual a numero 2: " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 sera diferente de numero 2: " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 sera igual a maior que o numero 2: " + simNao);

        if(numero1 < numero2)
            System.out.println("Verdadeiro");

        //Testando em valores de texto(string)
        String nomeUm = "Hermeson";
        String nomeDois = "Hermeson";
        String nomeTres = new String("Hermeson");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm.equals(nomeTres));

        //OBS: Use equals() para comparar objetos
    }
}
