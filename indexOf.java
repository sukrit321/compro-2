import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String a = sc.nextLine();
        if(n.indexOf(a) >= 0){
            System.out.println(n.indexOf(a ) + 1);

        }
        else{
            System.out.println("string not found");
        }
    }
}
