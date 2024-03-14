// we need to find array element greater than itself occuring atleast one time
// package Arrays;
import  java.util.*;

public class elementGreater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = elementGreaterOccuringOnce(arr);
        System.out.println("Your answer is "+result);
    }
    public static int  elementGreaterOccuringOnce(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(max == arr[i]){
                count++;
            }
        }

        return arr.length - count;
    }
}