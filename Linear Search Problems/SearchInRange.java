// to find element in range, set a start, end and target to find.
//do search by for loop from start to end return index

public class SearchInRamge {
    public static void main(String[] args) {
        int[] arr = {1,3,32,23,45,86,35,13,64};
        // int start=arr[3];
        // int end=arr[7];
        int target=45;
        System.out.println(searchInRange(arr, 1, 10, target));
    }
    static int searchInRange(int arr[], int start, int end, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=start; index<end;index++){
            // int element=arr[index];
            if(arr[index]==target){
                return index;
        }
    }
    return -1;
}
}
