import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
         Scanner SC = new Scanner(System.in);

         int numero ;
         String agencia ;
         String nomeCompleto;
         double saldo;
         String texto;         

         System.out.println("Informe nome do cliente");
         nomeCompleto = SC.next();  // SC.nextLine();         
                  
         System.out.println("Numero da conta ");         
         numero = SC.nextInt();

         System.out.println("Agencia");
         agencia = SC.next();
         
         System.out.println("Valor ");         
         saldo = SC.nextDouble() ;
       
         texto = "Ola "+nomeCompleto+" obrigado por criar uma conta em nosso banco , sua agencia é: "+agencia+
                 ", conta numero: " +numero+
                 " e seu saldo : "+saldo+" ja esta disponivel para saque";

         System.out.println(texto);
         SC.close();
    }
}
