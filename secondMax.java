package Arrays;
import java.util.*;

public class secondMax {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:- ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int i;
    for(i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
    int secondMax=Integer.MIN_VALUE;

    for(i=0;i<n;i++){
        if(max < arr[i]){
            secondMax = max;
            max = arr[i];
        } else if(secondMax < arr[i]){
            secondMax = arr[i];
        }
    }

    System.out.println("\nThe Maximum element is "+max+"\nThe Second Maximum element is "+secondMax);
 }
}
