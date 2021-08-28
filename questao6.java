import java.io.IOException;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws  IOException {

    Scanner receber = new Scanner (System.in);

    int nmr;
    String numero;
      System.out.println("Escreva um número: ");
      nmr = receber.nextInt();

numero= Integer.toString(nmr);
System.out.println(" A quantidade de numeros digitados é: " +numero.length());

  }
}
