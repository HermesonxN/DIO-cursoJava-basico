public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        /* 
        //Usando Estrutura condicional
        String resultado = "";
        if(a==b)
            resultado = "Verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado); 
        */

        //usando operador ternario
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        int resultado2 = a==b ? 1 : 0;
        System.out.println(resultado2);

        //OBS: O operador ternario "?" so vai funcionar se a operação verificada for booleana
    }
}
