/*O programa correto é o A
pra corrigir o programa b eu adicionei o comando if. 
*/

import java.util.Scanner;

   public class Codigo {
   public static void main(String[] args) {
  
    
	Scanner teclado = new Scanner(System.in); 
        int codigo;  
        do { 
            System.out.print("Informe o código: "); 
            codigo = teclado.nextInt();
            if(codigo != -1){    
                System.out.println("Código: " + codigo); 
            }
            
        } while (codigo != -1);
        teclado.close();
    }

}
  
