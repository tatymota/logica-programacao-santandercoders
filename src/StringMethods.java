import java.sql.SQLOutput;

public class StringMethods {

    public static void main(String[] args) {
        String string = new String ("Olá");
        String string2 = "tchau";

        System.out.println("Soma = " + 3 + 5); //concatenate
        System.out.println("Soma = " + (3 + 5)); //soma
        // a ordem de precendência começa da esquerda para a direita
        System.out.println( 3 + 5 + " Soma");


        int numero = 3 + 5;
        String soma = "Soma = ".concat(numero + "");
        //soma += numero;
        System.out.println(soma);

        //para saber o tamanho de characteres dentro da string
        int tamanho = soma.length();
        System.out.println(tamanho);

        //para saber o index na string (array)
        System.out.println(soma.indexOf('m'));

        //passar o index e extrair da string
        System.out.println(soma.substring(3,7));

        //dividir a string com "split"
        String email = "tatyanna.mota@hotmail.com";
        String[] split = email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        //String to maiuscula/minuscula
        System.out.println(email.toUpperCase());

        //caso removemos os espaços entre as letras
        String espaco = "  1 2 3 4 5   ";
        System.out.println(espaco.trim().replace(" ",""));

    }
}
