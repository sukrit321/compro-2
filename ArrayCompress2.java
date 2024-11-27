import java.util.Scanner;

public class ArrayCompress2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int taget1 = sc.nextInt();
        int taget2 = sc.nextInt();
        int taget3 = sc.nextInt();
        int sum = 0;
        int cnt_ta = 0;
        for (int i = 0; i < n; i++){
            if (){

            }
            else if(arr[i] == taget1 || taget2 || taget3){
                System.out.print(sum + " ");
                System.out.print(arr[i] + " ");
                cnt_ta++;
                sum = 0;
            }
            else {
                sum = sum + arr[i];
            }
        }
        System.out.print(sum);
    }
}
