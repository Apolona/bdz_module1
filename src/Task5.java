import java.util.Scanner;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt(), h;
        if(m<3){
            m+=12;
            y--;
        }
        int k = Math.floorMod(y, 100), j = y/100;
        h = Math.floorMod( q + (13*(m+1))/5 + k + k/4 + j/4 -2*j, 7);
        switch (h){
            case (0):
                System.out.println("Saturday");
                break;
            case (1):
                System.out.println("Sunday");
                break;
            case (2):
                System.out.println("Monday");
                break;
            case (3):
                System.out.println("Tuesday");
                break;
            case (4):
                System.out.println("Wednesday");
                break;
            case (5):
                System.out.println("Thursday");
                break;
            case (6):
                System.out.println("Friday");
                break;
        }
    }
}