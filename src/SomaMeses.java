public class SomaMeses {
    public static void main(String[] args) {
            String frase = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";
            String[] totalMes = frase.split(",");

            int valorTotal = 0;
            for (int i = 0; i < totalMes.length; i++) {
                System.out.println(totalMes[i].trim());
                String mes = totalMes[i].trim();
                String[] mesSeparado = mes.split(": ");
                int valorDoMes = Integer.parseInt(mesSeparado[1]);

                valorTotal = valorTotal + valorDoMes;
            }
            System.out.println("Total: " + valorTotal);

    }
}
