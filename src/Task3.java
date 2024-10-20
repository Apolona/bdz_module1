import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), cnt=1;
        int[] mas = new int[n];
        for(int i = 0; i<n; ++i){
            int x = sc.nextInt();
            mas[i]=x;
        }
        for(int i = 1; i<n; ++i) {
            if (mas[i] != mas[i - 1]) {
                cnt++;
            }
        }
        int[] ans = new int[cnt];
        int k=1;
        ans[0] = mas[0];
        for(int i = 1; i<n; ++i){
            if(mas[i]!=mas[i-1]){
                ans[k]=mas[i];
                k++;
            }
        }
        for(int i = 0; i<cnt; ++i){
            System.out.print(ans[i]+" ");
        }
    }
}