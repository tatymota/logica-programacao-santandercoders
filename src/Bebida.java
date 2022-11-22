public enum Bebida {

    AGUA("Agua", 2.50),
    COCA_COLA("Coca-Cola", 5.00),
    COCA_COLA_0("Coca-Cola 0", 4.50),
    PEPSI("Pepsi", 4.40),
    GUARANA("Guaraná", 3.50),
    FANTA_LARANJA("Fanta Laranja", 4.23);

    private String nome;
    private double preco;

    Bebida(String name, double price){
        this.nome = name;
        this.preco = price;
    }

    public String getInformacoes(){
        return this.nome + " custa R$" + this.preco;
    }
}
