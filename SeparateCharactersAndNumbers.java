import java.util.Scanner;
public class SeparateCharactersAndNumbers {
    static String split(String msg) {
        if(msg.length() == 1){
            return msg;
        }
        if(Character.isDigit(msg.charAt(0))){
            return split(msg.substring(1)) + msg.charAt(0);
        }
        else {
            return msg.charAt(0)+ split(msg.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String res = split(msg);
        System.out.println(res);
    }
}