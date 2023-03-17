public class Usuario {
    public static void main(String[] args) throws Exception {

    
    SmartTv smartTv = new SmartTv ();
    
    System.out.println("TV está ligada ? " + smartTv.status);
    System.out.println("Canal atual ? " + smartTv.canal);
    System.out.println("Volume atual ? " + smartTv.volume);
    
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("O volume da Tv está em: " + smartTv.volume);
    
    
    smartTv.ligar ();
    System.out.println("Novo status - a Tv esta ligada: " + smartTv.status);
    
    smartTv.desligar ();
    System.err.println("Novo status - a Tv está desligada: " + smartTv.status);

    smartTv.ligar ();
    System.out.println("Novo status - a Tv esta ligada: " + smartTv.status);
    
    smartTv.mudarCanal(18);
    smartTv.subirCanal();
    smartTv.diminuirCanal();
    smartTv.diminuirCanal();
    smartTv.diminuirCanal();
    smartTv.diminuirCanal();
    smartTv.mudarCanal(14);
    System.out.println("O canal atual é: " +smartTv.canal);
}
} 