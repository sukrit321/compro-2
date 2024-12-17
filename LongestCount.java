import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(;;){
            String a = sc.nextLine();
            if(a == ""){
                break;
            }
            if(a.length() >= max){
                if(a.length() == max){
                    cnt++;
                }
                else {
                    max = a.length();
                    cnt = 0;
                    cnt++;
                }
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
