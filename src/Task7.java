import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = new int [n+1][];
        for(int i=0; i<n; ++i) {
            mas[i] = new int[i + 2];
            for (int j = 0; j <= i; ++j) {
                mas[i][j] = sc.nextInt();
            }
        }
        for(int i=n-2; i>=0; --i){
            for(int j=0; j<=i; ++j){
                mas [i][j] += Math.max(mas[i+1][j], mas[i+1][j+1]);
            }
        }
        System.out.println(mas[0][0]);
    }
}