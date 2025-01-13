public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,7,8,9,12,24,55};
        int start=4;
        int end=9;
        
        System.out.println((maxRange(arr, start, end)));
    }

    static int maxRange(int arr[], int start, int end) {
        if(arr==null){
            return -1;
        }
        else if (start > end) {
            return -1;
        }
        else if (arr.length==0) {
            return -1;
        }
        
        int max=arr[start];
        for(int i =0;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
