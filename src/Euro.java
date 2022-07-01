public class Euro extends Moeda{


    public Euro(double valor) {
        super(valor);
    }

    public Euro() {
    }

    public void info(){
        System.out.println("valor: "+ valor);

    }
    public double converter(double valor){
        this.valor = valor * 5.54;//cotação do dia 24/06/2022
        return valor;
    }
}
