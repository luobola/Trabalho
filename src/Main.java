import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cofrinho oPorquinho = new Cofrinho();
        Scanner entrada = new Scanner(System.in);
        int op = 9;


        while(op != 0) {

            System.out.println();
            System.out.println("=== Bem vindo ao Porquinho ===");
            System.out.println("1) Por Dinheiro?" + "\n"
                    + "2) Retirar Dinheiro?" + "\n"
                    + "3) Quanto Tem no Porquinho?" + "\n"
                    + "...Digite 0 para Sair..." + "\n"
                    + ">.");
                    op = entrada.nextInt();

                    switch (op){
                        case 1 ://adicionar moeda
                            System.out.println("Quanto quer por? " + "\n" + ">.");
                            double vMoeda = entrada.nextDouble();

                            oPorquinho.adicionar(vMoeda);

                            oPorquinho.listagemMoeda();

                            break;
                        case 2 ://retirar moeda
                            break;
                        case 3 ://total de dinheiro
                            oPorquinho.totalConvertido();
                            break;

                        default:
                    }

        };


    }
}