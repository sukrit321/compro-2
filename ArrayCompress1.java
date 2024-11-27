import java.util.Scanner;

public class ArrayCompress1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int taget = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == taget){  
                System.out.print(sum + " ");
                System.out.print(taget + " ");
                sum = 0;
            }
            else {
                sum = sum + arr[i];
            }
        }
        System.out.print(sum);
    }
}
