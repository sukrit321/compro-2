import java.util.Scanner;

public class LongestString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String n = "";
        for(int i = 0; i < 5; i++){
            String a = sc.nextLine();
            if(a.length() >= max){
                max = a.length();
                n = a;
            }
        }
        System.out.println(n);
    }
}
