public class Operadores {
    public static void main(String[] args) throws Exception {
        
        String concatenacao = "?";
        System.out.println(concatenacao);

        /* 
        Enquanto o proximo valor for numerico, ele vai continuar somando
        quando chegar em uma string ele vai concatenar
        resultado: 31
         */
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        /* 
        Quando o valor seguinte for uma string ele vai concatenar tudo ate o fim
        resultado: "1111"
         */
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        /* 
        As duas operações abaixo, vão ter mesmo resultado no final
        pois a partir do momento que for detectado uma string, tudo vai ser concatenado
        resultado: "1111"
         */
        concatenacao = "1"+1+1+1;
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        /* 
        O resultado da operação, sera diferentes das anteriores pois, sera concatenado
        somente depois que o resultado entre parenteses for evidenciado
        resultado: "13"
         */
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
