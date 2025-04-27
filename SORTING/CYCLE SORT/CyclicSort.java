// CYCLIC SORT : 
// Idea : when given no.s from RANGE 1 to N then we use Cyclic Sort. for example : [3,5,2,1,4] all no.s are in range 1 to 5.
/* algo : index = Value - 1

      0 1 2 3 4  <- index
     [1,2,3,4,5] <- array values

     hence, for index its value - 1
     note : move only i value to check its index and swap with the other which is already present in i's new index.
*/

// after 1st pass (i=0): [3,5,2,1,4] -> 3 will be checked, it must have index=val-1 = 2nd, it will be swapped [2,5,3,1,4]
// after 1st pass (i=1): [2,5,3,1,4] -> 2 will be checked, it must have index=val-1 = 1st, it will be swapped [5,2,3,1,4]
// after 1st pass (i=2): [5,2,3,1,4] -> 5 will be checked, it must have index=val-1 = 4th, it will be swapped [4,2,3,1,5]
// after 1st pass (i=3): [4,2,3,1,5] -> 4 will be checked, it must have index=val-1 = 3rd, it will be swapped [1,2,3,4,5]

// final : [2,5,3,1,4] -> [5,2,3,1,4] -> [4,2,3,1,5] -> [1,2,3,4,5]

//  CODE:

import java.util.*;
class CyclicSort{
    public static void Cyclesort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                Swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void Swap(int[]arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,2,4};
        Cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
