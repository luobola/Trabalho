public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    public Dolar() {
    }

    public void info(){
        System.out.println("valor: "+ valor);

    }
    public double converter(double valor){
        this.valor = valor * 5.24;//cotação do dia 24/06/2022
        return valor;
    }
}
