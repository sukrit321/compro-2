import java.util.Scanner;

public class IndexAndValue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int cnt = 0;
        if(index1 >= 0 && index1 < n){
            System.out.println(arr[index1]);
            cnt++;
        }
        else {
            System.out.println(-1);
        }
        if(index2 >= 0 && index2 < n){
            System.out.println(arr[index2]);
            cnt++;
        }
        else {
            System.out.println(-1);
        }
        System.out.println(cnt);
    }
}
