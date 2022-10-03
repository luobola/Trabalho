public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }
    public Dolar() {
    }
    @Override
    public void info(){
        System.out.printf("\nDolar: %.2f ", valor);
    }
    @Override
    public double converter(double valor){
        super.valor = valor  * 5.24;//cotação do dia 24/06/2022
        return super.valor;
    }
}
