public enum TipoDeConta {
    CORRENTE("conta corrente"), POUPANCA("conta poupanca");

    //atributos
    private String tipo;

    //construtor
    TipoDeConta(String type){
        this.tipo = type;
    }

    //metodos
    public String getTipo() {
        return tipo;
    }
}
