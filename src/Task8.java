import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        f(n, 'A', 'C', 'B');
    }
    public static void f(int n, char a, char c, char b) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + a + " to " + c);
            return;
        }
        f(n - 1, a, b, c);
        System.out.println("Move disk " + n + " from " + a + " to " + c);
        f(n - 1, b, c, a);
    }
}