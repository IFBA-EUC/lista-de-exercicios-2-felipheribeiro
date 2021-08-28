import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner receber = new Scanner(System.in);
        String r;
        float c;
        double m, s;
        int I;

        m = 0;
        s = 0;

        System.out.print("Valor total do investimento: ");
        c = receber.nextFloat();
        System.out.print(" Juros mensal: ");
        I = receber.nextInt();
        s = c;

        do{
            for(int A = 1; A <= 12; A++){
                s = s + ((s * I) / 100);
                m = m+ s;
            }
            System.out.println("Saldo do investimento após 1 ano: " + m);
            System.out.println("Deseja processar mais um ano? (S/N)");
            r = receber.next();
            s = m;
        }while((R.equals("S")) || (R.equals("s")));


    }
}
}
