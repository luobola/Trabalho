import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {

    ArrayList<Moeda> moedinhas = new ArrayList<Moeda>();
    Scanner in = new Scanner(System.in);
    Dolar d = new Dolar();
    Euro e = new Euro();

    double mTotal = 0;

    public double adicionar(double moeda){

        System.out.println("Qual Moeda? "
                            + "\n" + "1 - Dolar"
                            + "\n" + "2 - Euro"
                            + "\n" + "3 - Real");
            int op = in.nextInt();
                switch (op){
                    case 1://adiciona dolar
                        moedinhas.add(new Dolar(moeda));
                        break;
                    case 2:
                        moedinhas.add(new Euro(moeda));
                        break;
                    case 3:
                        moedinhas.add(new Real(moeda));
                        break;
                    default:
                        System.out.println("comando invalido");
                        break;
                }
        return moeda;
    }

    public double remover(double moeda){

        return moeda;
        }


    public void listagemMoeda(){
        double doleta = 0;
        double eurinho = 0;
        double realzin = 0;
        for( Moeda m: moedinhas){
            if (m instanceof Dolar) {
                doleta += m.valor;
            } else if (m instanceof  Euro) {
                eurinho += m.valor;
            }else if (m instanceof  Real){
                realzin += m.valor;
            }
        }
        System.out.printf("\nTotal Em Dolar: %.2f" +
                          "\nTotal Em Euro : %.2f "+
                          "\nTotal em Reais: %.2f ", doleta,eurinho,realzin);
    }


    public void totalConvertido(){
        double total = 0;
        for( Moeda m: moedinhas){
            if (m instanceof Dolar) {
               m.converter(m.valor);
               m.info();
            } else if (m instanceof  Euro) {
                m.converter(m.valor);
                m.info();
            }else if (m instanceof  Real){
                m.converter(m.valor);
                m.info();
            }
        }
            for (Moeda m: moedinhas) {
                total += m.valor;
            }
            System.out.printf("\nO porquinho esta com um total de: %.2f", total);
    }

}
