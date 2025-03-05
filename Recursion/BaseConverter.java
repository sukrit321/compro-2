import java.util.Scanner;
public class BaseConverter {

    String convertBase(int decimal, int base) {
    if(decimal / base == 0){
        return Integer.toString(decimal % base);
    }
    return convertBase(decimal / base, base) + "" + decimal % base;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();
        int decimal = sc.nextInt();
        int base = sc.nextInt();
        String result = bc.convertBase(decimal, base);
        System.out.println(result);
    }
}