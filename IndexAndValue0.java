import java.util.Scanner;

public class IndexAndValue0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        if(index >= 0 && index < n){
            System.out.println(arr[index]);
        }
        else {
            System.out.println(-1);
        }
    }
}
