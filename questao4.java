import java.util.Scanner;

public class main {

    public static void main(String[] args){

        String nome; 
        int quantidade; 
        double preco;
        Scanner receber = new Scanner(System.in);

            System.out.println("Escreva o nome do produto: ");
            nome = receber.nextLine();
            System.out.println("Escreva o preco: ");
            preco = receber.nextDouble();
            System.out.println("Escreva a quantidade: ");
            quantidade = receber.nextInt();

            System.out.println("inf da compra:");
            if(quantidade >= 11 && quantidade <= 20){

                preco = preco * quantidade;
                preco = preco - (preco * 10) / 100;

                System.out.println("Nome do produto: "+nome);
                System.out.println("quantidade do produto: "+quantidade);
                System.out.println("preco total: "+preco);

            }else if(quantidade >= 21 && quantidade <= 50){

                preco = preco * quantidade;
                preco = preco - (preco * 20) / 100;

                System.out.println("nome do produto: "+ nome);
                System.out.println("quant de produtos: "+ quantidade);
                System.out.println("preco total: "+ preco);

            }else if(quantidade > 50){

                preco = preco * quantidade;
                preco = preco - (preco * 25) / 100;

                System.out.println("nome do produto: "+ nome);
                System.out.println("quant de produtos: "+ quantidade);
                System.out.println("preco total: "+ preco);

            }else{

                preco = preco * quantidade;
                System.out.println("nome do produto: "+ nome);
                System.out.println("quant de produtos: "+ quantidade);
                System.out.println("preco total: "+ preco);

            }
    }
}
