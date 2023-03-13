public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2)
            System.out.println("As duas condições seram verdadeiras");
            //False

        if(condicao1 || condicao2)
            System.out.println("Uma das condições sera verdadeira");
            //True

        if(condicao1 && (7 > 4))
            System.out.println("As duas condições seram verdadeiras");
            //False

        if(condicao1 || (7 > 4))
            System.out.println("Uma das condições sera verdadeira");
            //True
            
        System.out.println("Fim");
    }
}