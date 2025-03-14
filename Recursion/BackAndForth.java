import java.util.Scanner;
public class BackAndForth {
    String reorder(String s, boolean forward) {
    if(s.length() == 0){
        return "";
    }
    if(forward){
        if(s.charAt(0) == 'A'){
            return s.charAt(0) + reorder(s.substring(1, s.length()), false);
        }
        return s.charAt(0) + reorder(s.substring(1, s.length()), true);
    }
    else {
        if(s.charAt(s.length() - 1) == 'A'){
            return s.charAt(s.length() - 1) + reorder(s.substring(0, s.length() - 1), true);
        }
        return s.charAt(s.length() - 1) + reorder(s.substring(0, s.length() - 1), false);
    }
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BackAndForth baf = new BackAndForth();
        String answer = baf.reorder(s, true);
        System.out.print(answer);
    }
}