import java.util.Scanner;

public class Triple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int taget = sc.nextInt();
        int cnt = 0;
        int max = -999999;
        for(int i = 2; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == taget){
                    cnt++;
                }
                else if(arr[i][j] != taget){
                    cnt = 0;
                }
                if(cnt > max){
                    max = cnt;
                    
                    
                }
            }
            // System.out.println(i);
            if(max >= 3){
                System.out.print(i + 1 + " ");
            }
            max = -999999;
        }
    }
}
