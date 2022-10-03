public class Real extends  Moeda{

    public Real(double valor) {
        super(valor);
    }
    public Real() {
    }
    @Override
    public void info(){
        System.out.printf("\nReais: %.2f", valor);
    }
    @Override
    public double converter(double valor){
        super.valor = valor;
        return super.valor;
    }

}