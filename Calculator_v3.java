import java.util.Scanner;

public class Calculator_v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[10];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int num = 0;
        for(int i = 0; i < 10; i++){
            int order = sc.nextInt();
            if(order == 1){
                int taget_1 = sc.nextInt();
                int taget_2 = sc.nextInt();
                if((taget_1 >= 0 && taget_2 >= 0) && (taget_1 < n && taget_2 < n)){
                    sum[i] = arr[taget_1] + arr[taget_2];
                    System.out.println(sum[i]);
                    num = sum[i];
                }
                else{
                    System.out.println("error");
                }
            }
            else if(order == 2){
                /*if(sum[0] == 0){
                    System.out.println("none");
                }*/
                if(num == 0){
                    System.out.println("none");
                }
                else{
                    System.out.println(num);
                    num = 0;
                    sum[i - 1] = 0;
                }
            }
            else{
                break;
            }
        }
        for(int i = 0; i < 10; i++){
            if(sum[i] > 0){
                cnt++;
            }
        }
        for(int i = 0; i < 10; i++){
            if(cnt == 0){
                System.out.println("empty");
                break;
            }
            else{
                if(sum[i] > 0){
                    System.out.print(sum[i] + " ");
                }
            }
        }
    }
}
