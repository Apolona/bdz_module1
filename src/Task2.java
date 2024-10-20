import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char x = str.charAt(0);
        int cnt = 0;
        for(int i = 0; i<str.length(); ++i) {
            if (str.charAt(i) == x && cnt < 127) {
                cnt++;
            } else {
                System.out.print(x + "" + cnt);
                cnt = 1;
                x = str.charAt(i);
            }
        }
        System.out.print(x +""+ cnt);
    }
}