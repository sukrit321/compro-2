import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int taget = sc.nextInt();
        if(taget <= 0 || taget > n.length()){
            System.out.println("invalid position");
        }
        else{
            System.out.println(n.charAt(taget - 1));

        }
    }
}
