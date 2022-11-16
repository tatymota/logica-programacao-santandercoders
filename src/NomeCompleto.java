import java.util.Scanner;

public class NomeCompleto {

    public static void main(String[] args) {
        //Utilizando replace all
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String resultado = nomeCompleto.replaceAll(" ", " !");
        System.out.println("!" + resultado);

        //utilizando split + for
        String[] resultado2 = nomeCompleto.split(" ");
        for (int i = 0; i < resultado2.length ; i++) {
            System.out.print("!" + resultado2[i] + " ");

        }


    }
}
