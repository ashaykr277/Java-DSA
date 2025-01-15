// to search in 2D array or matrix
// create a matrix of size nxn
// use int[] as function to declare new array for copying index to an array as it cotains row & col, it will be in the form, [row,col]
// use for loop for i and j ; for j it will be arr[row].length
// return new array by new int[]{row,col} else new int{-1,-1}

import java.util.Arrays;
public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=5;
        int ans[]=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int arr[][], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
