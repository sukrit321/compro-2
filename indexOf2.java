import java.util.Scanner;
public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String n = sc.nextLine();
        String a = sc.nextLine();
        int num = 0;
        int index = 0;
        for(int i = n.indexOf(a); i != -1; i=n.indexOf(a, i)){
            System.out.print(i + 1 + " ");
            i+=1;
            num++;
        }
        if(num == 0){
            System.out.println("string not found");
        }
    }
}
