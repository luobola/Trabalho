public class Real extends  Moeda{

    public Real(double valor) {
        super(valor);
    }

    public Real() {
    }

    public void info(){
        System.out.println("valor: "+ valor);
    }

    public double converter(double valor){
        this.valor = valor;
        return valor;
    }

}