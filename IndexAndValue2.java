import java.util.Scanner;

public class IndexAndValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        if(index1 >= 0 && index1 < n){
            System.out.println(arr[index1]);
            if(arr[index1] > max){
                max = arr[index1];
            }
        }
        else {
            System.out.println(-1);
            cnt++;
        }
        if(index2 >= 0 && index2 < n){
            System.out.println(arr[index2]);
            if(arr[index2] > max){
                max = arr[index2];
            }
        }
        else {
            System.out.println(-1);
            cnt++;
        }
        if(cnt == 2){
            System.out.println("No");
        }else{
            System.out.println(max);
        }
    }
}
