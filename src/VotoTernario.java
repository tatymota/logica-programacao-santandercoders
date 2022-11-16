import java.util.Scanner;

public class VotoTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade e verifique a obrigatoriedade do seu voto: ");
        String idadeEleitor = scanner.nextLine();

        try{
            int idade = Integer.parseInt(idadeEleitor);

            String voto = (idade >= 18 && idade <= 70)? "Voto Obrigatório" :
                    (idade >= 16 &&  idade < 18) || (idade > 70)? "Voto facultativo" :
                            (idade <= 0)? "Digite uma idade válida (deve ser maior do que zero)" :
                                    "Sem direito a votar";
            System.out.println(voto);
        }catch (Exception e){
            System.out.println("Digite uma idade válida!");
        }
    }
}
