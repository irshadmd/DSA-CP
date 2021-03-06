import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    // write code here    
    int max=0;
    for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
    }
    
    int counter=0;
    while(max!=0){
        max=max/10;
        countSort(arr,(int)Math.pow(10,counter));
        counter++;
    }
    
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    int[] farr=new int[10];
    for(int i=0;i<arr.length;i++){
        farr[(arr[i]/exp)%10]++;
    }
    
    for(int i=1;i<farr.length;i++){
        farr[i]=farr[i-1]+farr[i];
    }
    
    int[] ans=new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        int pos=farr[(arr[i]/exp)%10];
        ans[pos-1]=arr[i];
        farr[(arr[i]/exp)%10]--;
    }
    
    for(int i=0;i<arr.length;i++){
        arr[i]=ans[i];
    }
    
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}