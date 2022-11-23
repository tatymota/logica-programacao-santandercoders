import java.util.Scanner;

public class GastoMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao mês para verificar o valor total gasto (exemplo: digite 1 para janeiro, 2 para fevereiro...):");
        int mes = scanner.nextInt();
        float valorDoMes = Mes.getGastoMes(mes);

        System.out.println("O valor gasto nesse mês é de R$" + valorDoMes);

    }
}
