import java.util.Scanner;
public class GoInside {
    String goInside(String str, boolean front) {
        if(str.length() == 1){
            return str;
        }
        else if(str.length() == 2 && front){
            return str.charAt(0) + "" +  str.charAt(str.length() - 1);
        }
        else if(str.length() == 2 && !front){
            return str.charAt(str.length() - 1) + "" + str.charAt(0);

        }
        if(front){
            return str.charAt(0) + "" +  str.charAt(str.length() - 1) + goInside(str.substring(1, str.length() - 1), false);
        }
        else {
            return str.charAt(str.length() - 1) + "" + str.charAt(0) + goInside(str.substring(1, str.length() - 1), true);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}