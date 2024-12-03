import java.util.Scanner;

public class CondoSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num_home = sc.nextInt();
        int user_buy = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            arr[i] = i + num_home;
        }
        for(int i = 0; i < user_buy; i++){
            int num_buy = sc.nextInt();
            if(num_buy <= (num_home + n) - 1 && num_buy >= num_home){
                // arr[num_buy - 1] = -1;
                for(int j = 0  ; j < n; j++){
                    if(arr[j] == num_buy){
                        arr[j] = -1;
                    }
                }
                // System.out.println(num_buy);
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] == -1){
                cnt++;
            }
        }
        System.out.println(cnt);
        for(int i = 0; i < n; i++){
            if(arr[i] == -1){
                System.out.println(i + num_home);
                // System.out.println(i);
            }
        }
    }
}