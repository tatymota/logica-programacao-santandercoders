public class IdadeDaSorte {

    public static void main(String[] args) {
        int idade1 = 29;
        int idade2 = 42;
        int idade3 = 50;

        printNumeroDaSorte(idade1);
        printNumeroDaSorte(idade2);
        printNumeroDaSorte(idade3);
    }
    public static void printNumeroDaSorte(int idade){
        double numeroDaSorte = (double) idade;
        numeroDaSorte = numeroDaSorte + 0.023;
        System.out.println("O número da sorte é: " + numeroDaSorte);
    }
}
