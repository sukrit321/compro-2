import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String n = "";
        for(;;){
            String a = sc.nextLine();
            if(a == ""){
                break;
            }
            if(a.length() >= max){
                max = a.length();
                n = a;
            }
        }
        System.out.println(n);
    }
}
