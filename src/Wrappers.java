import java.util.ArrayList;
import java.util.List;

public class Wrappers {

    public static void main(String[] args) {
        int intt = 2;
        byte bytee = 8;
        long longg = 382193813;
        short shortt = 64;
        double doublee = 0.35;
        float floatt = 53.1F;
        char charr = 'a';
        boolean booleann = true;

        Integer int1 = intt;
        Byte byyte = bytee;
        Long loong = longg;
        Short shortt1 = shortt;
        Double double1 = doublee;
        Float float1 = floatt;
        Character char1 = charr;
        Boolean boolean1 = booleann;

        String a = int1.toString(intt);
        final Integer CONSTANTE = Integer.valueOf(a);
        final List<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list);
    }
}
