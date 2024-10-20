import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), pstr = sc.nextLine();

        int[] mas = new int[str.length()], pref = pr(pstr);
        int cnt = 0, i = 0, j = 0;

        while (i < str.length()) {
            if (pstr.charAt(j) == str.charAt(i)) {
                i++;
                j++;
            }
            if (j == pstr.length()) {
                mas[cnt] = i - j;
                cnt++;
                j = pref[j - 1];
            }
            else if (i < str.length() && pstr.charAt(j) != str.charAt(i)) {
                if (j != 0) {
                    j = pref[j - 1];
                }
                else {
                    i++;
                }
            }
        }
        int[] ans = new int[cnt];
        for (int k = 0; k < cnt; k++) {
            ans[k] = mas[k];
        }

        if (ans.length == 0) {
            System.out.println("-1");
        }
        else {
            for(int k=0; k<ans.length; ++k) {
                System.out.print(ans[k] + " ");
            }
        }
    }
    private static int[] pr(String pstr) {
        int[] pref = new int[pstr.length()];
        int c = 0, i = 1;

        while (i < pstr.length()) {
            if (pstr.charAt(i) == pstr.charAt(c)) {
                c++;
                pref[i] = c;
                i++;
            }
            else {
                if (c != 0) {
                    c = pref[c - 1];
                }
                else {
                    pref[i] = 0;
                    i++;
                }
            }
        }
        return pref;
    }
}