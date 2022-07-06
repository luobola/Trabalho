import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {

    ArrayList<Moeda> moedinhas = new ArrayList<Moeda>();
    Scanner in = new Scanner(System.in);
    double mTotal = 0;

    Dolar d = new Dolar();

    public double adicionar(double moeda){

        System.out.println("Qual moeda? " + "\n" + "1 - dolar"+ "\n" + "2 - Euro"+ "\n" + "3 - Real");
            int op = in.nextInt();
                switch (op){
                    case 1://adiciona dolar
                        moedinhas.add(new Dolar(d.converter(moeda)));
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
                eurinho+=m.valor;
            }else if (m instanceof  Real){
                realzin+=m.valor;
            }
        }
        System.out.printf("\nTotal Em Dolar: %.2f" +
                          "\nTotal Em Euro : %.2f "+
                          "\nTotal em Reais: %.2f ", doleta,eurinho,realzin);
    }


    public void totalConvertido(){
        double dolar = 0;
        double euro = 0;
        double real = 0;
        for( Moeda m: moedinhas){
            if (m instanceof Dolar) {
                dolar += m.valor * 5.24;
            } else if (m instanceof  Euro) {
                euro+=m.valor * 5.54;
            }else if (m instanceof  Real){
                real+=m.valor;
            }
        }
           // System.out.printf("\nO porquinho esta com um total de: %.2f", d.converter(dolar)+e.converter(euro)+real);
    }

    @Override
    public String toString() {
        return "Cofrinho{" +
                "moedinhas=" + moedinhas +
                '}';
    }
}
