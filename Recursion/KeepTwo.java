import java.util.Scanner;
public class KeepTwo {
    String keepTwo(String str) {
        if(str.length() == 1){
            return str;
        }
        char n = str.charAt(str.length() - 1);
        if(str.indexOf(n) == str.lastIndexOf(n, str.length() - 2)){
            return keepTwo(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }
        else if (str.indexOf(n) == str.lastIndexOf(n)){
            return keepTwo(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }
        else {
            return keepTwo(str.substring(0, str.length() - 1));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}