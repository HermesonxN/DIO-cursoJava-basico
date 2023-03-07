package edu.hermeson.sessao1;

public class MinhaClasse {
    
    public static void main(String[] args) {
        //Hello World
        System.out.println("Hello World");


        //Testando variaveis
        final String nome = "Francisco Hermeson";
        int idade = 18;
        System.out.println("Nome: " + nome.concat(", ") + "Idade: " + idade);
       

        //Testando metodos
        String primeiroNome = "Francisco Hermeson";
        String segundoNome = "Oliveira dos Santos";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }
}
