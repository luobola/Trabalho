public class Euro extends Moeda{


    public Euro(double valor) {
        super(valor);
    }

    public Euro() {
    }

    @Override
    public void info(){
        System.out.printf("\nEuro: %.2f", valor);

    }
    @Override
    public double converter(double valor){
        this.valor = valor * 5.54;//cotação do dia 24/06/2022
        return this.valor;
    }
}
