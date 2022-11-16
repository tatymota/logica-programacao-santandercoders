public class Trimestre {

    public static void main(String[] args) {
        int janeiro = 10000;
        int fevereiro = 17000;
        int marco = 23000;

        gastosTrimestre(janeiro, fevereiro, marco);
    }
    public static void gastosTrimestre(int mes1, int mes2, int mes3){
        System.out.println("O gasto total do trimestre foi de  = R$ " + (mes1 + mes2 + mes3));
    }
}