public class Real extends  Moeda{

    public Real(double valor) {
        super(valor);
    }

    public Real() {
    }

    public void info(){
        System.out.printf("\nValor Convertido: %.2f", valor);
    }

    @Override
    public double converter(double valor){
        this.valor = valor;
        return this.valor;
    }

}