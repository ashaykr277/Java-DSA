// initialize start and end
// find mid and compare with target whethere it is less that target or greater than
// if mid target is found return mid, else change start and end according to its position

public class BSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=7;
        System.out.println(bsearch(arr, target));
    }
    static int bsearch(int arr[], int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;

           if(target<mid){
            return end=mid-1;
           }
           else if(target>mid){
            return start=mid+1;
           }
           else{
            return mid;
           }
        }
        return -1;
    }
}
