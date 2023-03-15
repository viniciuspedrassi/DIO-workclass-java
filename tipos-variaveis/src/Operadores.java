public class Operadores {
  public static void main(String[] args)  {

    
    int a,b;

    a = 8;
    b = 7; 
    String resultado = a==b ?"verdadeiro" : "falso";
    System.out.println(resultado);
    
    int resultado2 = a==b ?10 : 100;
     System.out.println(resultado2);

    /* 
      if(a==b)
      resultado = "verdadeiro";
    else
      resultado = "falso";
    System.out.println(resultado);
    */

     int numero1 = 4;
     int numero2 = 3;
     System.out.println("Primeiro Numero: " + numero1);
     System.out.println("Segundo Numero: " + numero2);

     boolean simNao = numero1 == numero2;
      
     System.out.println("numeroUm é igual a NumeroDois? " + simNao);
    
     simNao = numero1 != numero2;
      System.out.println ("numeroUm é diferente de numeroDois? " + simNao);

    simNao = numero1 > numero2;
     System.out.println ("numeroUm é maior que numeroDois? " + simNao);

    if (numero1 < numero2){
      System.out.println("o numeroUm é menor que numeroDois");
        }
        else {
        System.out.println("o numeroUm não é menor que o numeroDois");
        }
      

      boolean condicao1 = true;
      boolean condicao2 = true;

      if (condicao1 && condicao2){
        System.out.println("as duas condiçoes sao verdadeiras");
     }

     if (condicao1 || condicao2){
      System.out.println("uma das condições é verdadeira");

     }

     if (condicao1 && (7 > 4)){
      System.out.println("as duas condições são verdadeiras");
     }


  
  
  
  }
}

