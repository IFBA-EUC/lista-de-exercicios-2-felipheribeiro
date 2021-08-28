import java.io.IOException;

import java.util.Scanner;


public class main {

    public static void main(String[] args) throws  IOException {

        Scanner receber = new Scanner(System.in);

        int nmr1, nmr2, q, n, a;
          nmr1 = 1;
          nmr2 = 0;
          System.out.println("Escreva um número: ");
          n = receber.nextInt();
          a = n + 1;
          for(int i = 0; i < a; i++){
          System.out.println (nmr2);
          q = nmr2;
          nmr2 = nmr1 + nmr2;
          nmr1 = q;
         }
    }

}
