public class SmartTv {
  boolean status=false;
  int canal=1;
  int volume=25;

  public void aumentarVolume (){
    volume++;
    System.out.println("Volume: " + volume);
  }

  public void diminuirVolume (){
    volume--;
    System.out.println("Volume: " + volume);
  }


  public void ligar(){
    status=true;
  }

  public void desligar(){
    status=false;

  }
  public void subirCanal (){
      canal++;
      System.out.println("Canal: " + canal);
    }
  public void diminuirCanal (){
      canal--;
      System.out.println("Canal: " + canal);
    }

  public void mudarCanal (int novoCanal){
    canal = novoCanal;
    System.out.println("Canal: " + canal);

  }
    
  }
