import java.util.*;
public class toggle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = new char[n];
        String str = sc.nextLine();
        for(int i=0;i<ch.length;i++){
            ch[i] = str.charAt(i);
        }
        toggle_to_lower_upper(ch);
        System.out.println(ch);
    }

    public static void toggle_to_lower_upper(char[] ch){
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i] = (char)(ch[i]+32);
            }else{
                ch[i] = (char)(ch[i]-32);
            }
        }
    }
}
