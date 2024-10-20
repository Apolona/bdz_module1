import java.util.Scanner;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(), str2 = sc.nextLine();
        char[] m1 = new char[str1.length()], m2 = new char[str1.length()];
        for(int i = 0; i<str1.length(); ++i){
            m1[i] = str1.charAt(i);
            m2[i] = str2.charAt(i);
            if(str1.charAt(i)>='A' && str1.charAt(i)<='Z'){
                m1[i] +=('a'-'A');
            }
            if(str2.charAt(i)>='A' && str2.charAt(i)<='Z'){
                m2[i] +=('a'-'A');
            }
        }
        Arrays.sort(m1);
        Arrays.sort(m2);
        boolean euqual = true;
        for(int i = 0; i<str1.length(); ++i){
            if(m1[i]!=m2[i]){
                euqual = false;
            }
        }
        if(euqual && str1.length()==str2.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}