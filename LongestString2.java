import java.util.Scanner;

public class LongestString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "";
        int max = -99999;
        for(int i = 0; i < 5; i++){
            String a = sc.nextLine();
            if(a.length() > max ){
                max = a.length();
                n = a;
            }
        }
        System.out.println(n);
    }
}
