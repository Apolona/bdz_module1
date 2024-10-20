import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean lastNull = false;
        while(n>0){
            if(n%10!=0){
                lastNull=true;
            }
            if(lastNull)
                System.out.print(n%10);
            n/=10;
        }
    }
}