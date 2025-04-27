// INSERTION SORT : It will partially sort from start to end, and put the element in correct position.

// Idea : put that index element at correct Index at LHS. for i=0, j=i+1,  i will run from 0 to 3 till 4 passes, and j will run till before last element or N-2 index becouse last one will be automatically largest.

/* algo : i<N-2 and j>0
        when element j !< element j-1, then break the loop. becouse LHS of j is already sorted.
        and when j>small elemnt on 2nd Index, then that is the ans
        
        sample image for sorting process : 
        c:\Users\arush\AppData\Local\Packages\MicrosoftWindows.Client.CBS_cw5n1h2txyewy\TempState\ScreenClip\{A4558C33-E19B-4F96-9BF4-8807AFBCBFD9}.png
 */

// after 1st pass (i=0): [5,3,4,1,2] -> 5,3 will be sorted to 3,5 so it will be [3,5, 4,1,2]              |  sort till index 1
// after 2nd pass (i=1): [3,5,4,1,2] -> 3,5,4 will be sorted to 3,4,5 so it will be [3,4,5, 1,2]          |  sort till index 2
// after 3rd pass (i=2): [3,4,5,1,2] -> 3,4,5,1 will be sorted to 1,3,4,5 so it will be [1,3,4,5, 2]      |  sort till index 3
// after 3rd pass (i=3): [1,3,4,5,2] -> 1,3,4,5,2 will be sorted to 1,2,3,4,5 so it will be [1,2,3,4,5]`  |  sort till index 4

// final : [5,3,4,1,2] -> [3,5,4,1,2] -> [1,3,4,5,2] -> [1,2,3,4,5]


// CODE :
import java.util.*;
public class InsertSort {
    public static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
