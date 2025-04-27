// SELECTION SORT : This will select the maximum element and put in correct index,
// example 3,5,2,1 here it will select 5 and put in last index that is correct position, then 3 to 2nd last. then till its sorted. 
// It can be done opposite too for putting minimum to first and compare.

// it will run N-i-1 times.

import java.util.*;
public class SelectionSort {
    public static void SelectSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            // find the max item and swap with correct index.
            int last=arr.length-i-1;
            int maxIndex=getMaxindex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }

    // create a swap funtion
    static void swap(int [] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    // create a function to get max number of array.
    static int getMaxindex(int[] arr, int start, int end) {
        // here in array [3, 7, 2, 9, 5, 1] let max=1, if i=1 then arr[1]=7, now compare max with every arr[i] if 7 is greater than every i then no change,
        // here arr[3]=9, compare max<arr[3] yes it will exchange the value and max=9 replaces 7.
        
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr={1,5,4,2,3,7};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
