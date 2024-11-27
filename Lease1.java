import java.util.Scanner;

public class Lease1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int y = sc.nextInt();
        for(int i = 0; i < n; i++){
            int y_new = y + arr[i] - 1;
            System.out.print(y_new + " ");
        }
    }
    
}
