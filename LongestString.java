import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =-9999;
        for(int i = 0; i < 5; i++){
            String n = sc.nextLine();
            if(n.length() > max){
                max = n.length();
            }
        }
        System.out.println(max);
    }
}
