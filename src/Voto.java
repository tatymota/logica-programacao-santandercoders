import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade e verifique a obrigatoriedade do seu voto: ");
        String idadeEleitor = scanner.nextLine();

        try{
            int idade = Integer.parseInt(idadeEleitor);

            if (idade >= 18 && idade <= 70 ){
                System.out.println("Voto Obrigatório");
            } else if ((idade >= 16 &&  idade < 18) || (idade > 70)){
                System.out.println("Voto facultativo");
            } else if (idade <= 0) {
                System.out.println("Digite uma idade válida (deve ser maior do que zero)");
            } else{
                System.out.println("Sem direito a votar");
            }
        }catch (Exception e){
            System.out.println("Digite uma idade válida!");
        }
    }
}
