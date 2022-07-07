import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {

    private ArrayList<Moeda> moedinhas = new ArrayList<Moeda>();
    Scanner in = new Scanner(System.in);

    //double mTotal = 0;
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
        System.out.println("Qual Moeda? "
                + "\n" + "1 - Dolar"
                + "\n" + "2 - Euro"
                + "\n" + "3 - Real");
            int op = in.nextInt();
                switch (op) {
                    case 1:
                        for( Moeda m: moedinhas){
                            if (m instanceof Dolar) {
                                m.valor -= moeda;
                            } else if (m instanceof  Euro) {
                                m.valor -= moeda;
                            } else if (m instanceof  Real) {
                                m.valor -= moeda;
                            }
                        }
                        break;
                }
    return moeda;
    }


    public void listagemMoeda(){
        for (Moeda m: moedinhas) {
            m.info();
        }
    }


    public void totalConvertido(){
        double v1 = 0;
        double v2 = 0;
        double v3 = 0;
        Dolar d = new Dolar();
        Euro e = new Euro();
        Real r = new Real();
            for( Moeda m: moedinhas){
                if (m instanceof Dolar) {
                    v1 += m.valor;
                } else if (m instanceof  Euro) {
                    v2 += m.valor;
                } else if (m instanceof  Real) {
                    v3 += m.valor;
                }
            }
                System.out.printf("\nO porquinho esta com um total de: %.2f", d.converter(v1)+e.converter(v2)+r.converter(v3));

    }
}
