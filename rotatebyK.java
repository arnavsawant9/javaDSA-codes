package Arrays;
import java.util.*;
public class rotatebyK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        //step 1 reverse entire array
        reverseArray(arr, 0, arr.length-1);
        //Step 2 Reverse first k element
        reverseArray(arr,0,k-1);
        //Step 3 Reverse rest of them
        reverseArray(arr,k,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int reverseArray(int arr[], int sp, int ep){
        int start = sp;
        int end = ep;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return 0;
    }
}
