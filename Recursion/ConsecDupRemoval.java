import java.util.Scanner;
public class ConsecDupRemoval {
    String dupRemove(String str) {
        if(str.length() == 1){
            return str;
        }
        else if(str.length() == 0){
            return "";
        }
        if(str.charAt(0) != str.charAt(1)){
            return str.charAt(0) + dupRemove(str.substring(1));
        }
        else {
            return dupRemove(str.substring(1));
        }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}