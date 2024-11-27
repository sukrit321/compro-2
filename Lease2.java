import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int y = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = y + arr[i] - 1;
        }
        int n_buy = sc.nextInt();
        for(int i = 0; i < n_buy; i++){
            int y_buy = sc.nextInt();
            int cnt = 0;
            for(int j = 0; j < n ;j++){
                if(y_buy > arr[j]){
                    System.out.print(j+1 + " ");
                    cnt++;
                }
            }
            if (cnt == 0){
                System.out.println("full");
            } else {
                System.out.println();
            }
        }
    }
}
