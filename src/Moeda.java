public abstract class Moeda {

    public double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public Moeda() {
    }

    public void info(){
        System.out.println("valor: "+ valor);

    }
    public double converter(double valor){
        this.valor = valor;
        return valor;
    }

}
