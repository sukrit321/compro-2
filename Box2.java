import java.util.Scanner;

public class Box2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); 
        }
        int order = sc.nextInt();
        int[] cnt = new int[n];
        int num = 0;
        for(int i = 0; i < order; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 1){
                int z = sc.nextInt();
                if (cnt[z - 1] + y <= arr[z - 1]){
                    cnt[z - 1] = cnt[z - 1] + y;
                    System.out.println(cnt[z - 1]);
                }
                else {
                    System.out.println(-1);
                }
            }
            else if (x == 2){
                for(int j = 0; j < n; j++){
                    if (cnt[j] - y >= 0){
                        System.out.print(j + 1 + " ");
                        System.out.println(cnt[j] - y);
                        cnt[j] = cnt[j] - y;
                        break;
                    }
                    else{
                        y = y - cnt[j];
                        cnt[j] = 0;
                        num++;

                    }
                    if (j == n - 1 && y > 0){
                        System.out.print(n + " ");
                        System.out.println(0);
                        break;
                    }
                }
            }
        }
    }
}