import java.util.*;
public class Maxin2D {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(maxArr(arr));
        
    }
    static int maxArr(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] ints:arr){
            for(int ele:ints){
                if(ele>max){
                    max=ele;
                }
            }
        }
        return max;
    }
}
