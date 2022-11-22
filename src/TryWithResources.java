import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite seu nome");
            String s = scanner.nextLine();
            System.out.println(s);
        }
    }
}
