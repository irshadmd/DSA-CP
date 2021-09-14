import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        
        reverse(arr);
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        
    }
    public static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}