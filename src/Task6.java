import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        while(b>0){
            int c = a&b;
            a = a^b;
            b = c<<1;
        }
        System.out.println(a);
    }
}