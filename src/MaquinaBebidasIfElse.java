import java.util.Scanner;

public class MaquinaBebidasIfElse {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("1 - Coca-Cola - R$ 5");
            System.out.println("2 - Coca-Cola 0 - R$ 4.50");
            System.out.println("3 - Pepsi - R$ 4,40");
            System.out.println("4 - Guaraná Antarctica - R$ 3,50");
            System.out.println("5 - Fanta Laranja - R$ 4,23");
            System.out.println("Água - R$ 2,50");
            System.out.println("----------------");

            System.out.println("Digite o numero do produto desejado: ");
            try{
                int escolha = scanner.nextInt();
                Bebida bebidaEscolhida;

                if (escolha == 1) {
                    bebidaEscolhida = Bebida.COCA_COLA;
                } else if (escolha == 2) {
                    bebidaEscolhida = Bebida.COCA_COLA_0;
                } else if (escolha == 3) {
                    bebidaEscolhida = Bebida.PEPSI;
                } else if (escolha == 4) {
                    bebidaEscolhida = Bebida.GUARANA;
                } else if (escolha == 5) {
                    bebidaEscolhida = Bebida.FANTA_LARANJA;
                }else{
                    bebidaEscolhida = Bebida.AGUA;
                }

                System.out.println(bebidaEscolhida.getInformacoes());
            } catch(Exception e){
                System.out.println("escolha invalida");
            }
        }
    }


