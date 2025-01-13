public class Max {
    public static void main(String[] args) {
        int [] arr={1,4,6,8,9,6};
        System.out.println(max(arr));
    }
    static int max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
