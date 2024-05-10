import java.util.*;
public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverse_string(str);
    }

    public static String reverse_string(String str){
        char[] ch = str.toCharArray();
        int n = str.length();
        int sp = 0;
        int ep = n-1;
        while(sp<ep){
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }
        String ans = str.valueOf(ch);
        return ans;
    }
}
