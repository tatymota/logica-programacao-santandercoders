public class Teste {
    public static void main(String[] args) {

        Pessoa tatyanna = new Pessoa("Tatyanna", "Vaz", 30);
        tatyanna.setIdade(-30);
        Pessoa pedro = new Pessoa("Pedro", "Vaz", 34);

        System.out.println(tatyanna.getInformacoes());
        System.out.println(tatyanna.getIdade());
        System.out.println(pedro.getInformacoes());

        TipoDeConta corrente = TipoDeConta.CORRENTE;
        TipoDeConta poupanca = TipoDeConta.POUPANCA;


        System.out.println(corrente.getTipo());
        System.out.println(poupanca.getTipo());

    }
}
