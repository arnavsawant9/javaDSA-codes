package Arrays;

import java.util.*;
class largenumberindex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Array input:- ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result = dominantIndex(arr);
        if(result == -1){
            System.out.println("No twice of index is greater");
        }else{
            System.err.println(result);
        }
    }
    
    // function to find the largest number which is two times as large as any other element in array
    public static int dominantIndex(int arr[]) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
                index = i;
            }else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        return secondMax*2 <= max ? index:-1;
    }
}