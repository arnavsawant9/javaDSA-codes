package Arrays;
public class swapArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        swap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr){
        int temp;
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }
}