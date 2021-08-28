import java.util.Scanner;

public class main {

    public static void main(String[] args){

        double distancia, d1, d2, d3, f1, f2, f3;
        Scanner receber = new Scanner(System.in);

        System.out.println("Escreva o primeiro valor: ");
        d1 = receber.nextDouble();
        System.out.println("Escreva o segundo valor: ");
        d2 = receber.nextDouble();
        System.out.println("Escreva o terceiro valor: ");
        d3 = receber.nextDouble();

        System.out.println("Escreva o quarto valor: ");
        f1 = receber.nextDouble();
        System.out.println("Escreva o quinto valor: ");
        f2 = receber.nextDouble();
        System.out.println("Escreva o sexto valor: ");
        f3 = receber.nextDouble();

        distancia = Math.sqrt(Math.pow((d1 - f1), 2) + Math.pow((d2 - f2), 2) + Math.pow((d3-f3), 2));

        System.out.printf("A distancia entre os dois pontos é de: " + distancia);

    }

}
