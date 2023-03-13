public class Usuario {
    public static void main(String[] args) {

        SmartTv tv = new SmartTv();

        //Status da Tv desligada
        System.out.println("A tv esta ligada: " + tv.ligada); //false
        System.out.println("Canal atual: " + tv.canal); //1
        System.out.println("Volume atual: " + tv.volume); //25


        //Status da Tv ligada
        System.out.println("Ligando a tv");
        tv.ligar();
        System.out.println("A tv esta ligada: " + tv.ligada); //True

        System.out.println("Diminuindo e aumentando o volume da tv");
        tv.diminuirVolume(); //24
        tv.diminuirVolume(); //23
        tv.diminuirVolume(); //22
        tv.aumentarVolume(); //23
        System.out.println("Volume atual: " + tv.volume); //23

        tv.mudarCanal(13);
        System.out.println("Canal atual: " + tv.canal); //13

    }
}
