import java.util.Arrays;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] mas = new char[n.length()];
        for(int i=0; i<n.length(); ++i){
            mas[i]=n.charAt(i);
        }
        Arrays.sort(mas);
        do {
            if (mas[0] != '0') {
                for(int i=0; i<mas.length; ++i){
                    System.out.print(mas[i]);
                }
                System.out.print(" ");
            }
        } while (f(mas));
    }
    private static boolean f(char[] mas) {
        int i = mas.length - 1;
        while (i > 0 && mas[i - 1] >= mas[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        int j = mas.length - 1;
        while (mas[j] <= mas[i - 1]) {
            j--;
        }
        char x = mas[i - 1];
        mas[i - 1] = mas[j];
        mas[j] = x;
        int l = mas.length - 1;
        while (i < l) {
            x = mas[i];
            mas[i] = mas[l];
            mas[l] = x;
            i++;
            l--;
        }
        return true;
    }
}