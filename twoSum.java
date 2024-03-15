import java.util.*;
// did this using an array, there's a more optimal solution to it using hasmap
public class twoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        if(twoSumCheck(arr,k)==true){
            System.out.println("There exists a solution where sum is equal to K.");
        }
    }

    public static boolean twoSumCheck(int [] arr, int k) {
       // boolean flag = false;  // we are making use of flags to print only once!!
        for(int i=1;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k && i!=j){
                    return true;
                }
            }
        }
        return false;
    }   
}
