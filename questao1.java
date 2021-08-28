import java.util.Scanner;

public class main {

   public static void main(String[] args) {
   Scanner receber = new Scanner(System.in);

   int A, B, C;
   double Delta, X1, X2;
   System.out.println("Escreva o valor de A: ");
   A = receber.nextInt();
   while(A == 0) {
       System.out.println("O valor de 'A' não pode ser 0");
       System.out.println("Escreva um valor diferente de 0");
       A = receber.nextInt();
   }
   System.out.println("Escreva o valor de B: ");
   B = receber.nextInt();
   System.out.println("Escreva o valor de C: ");
   C = receber.nextInt();

   Delta = Math.pow(B, 2) - (4 * A * C);

   if (Delta < 0) {
       System.out.println("Não tem raízes reais");
   }else {
       X1 = (-B + Math.sqrt(Delta))/(2 * A);
       X2 = (-B - Math.sqrt(Delta))/(2 * A);

       System.out.println("O valor de x1 é: " + X1);
       System.out.println("O valor de x2 é: " + X2);
   }


   }
}
