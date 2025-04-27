//Bubble sort : it is like evaporating largest bubble to air 
//                          (or)
//  Shifting the largest among array to the last position till its sorted.

// import java.util.*;
class BubbleSort{
    public static void Bubble(int[] arr){
        // boolean swapped;

        //  run the steps N-1 times.
        for(int i=0;i<arr.length;i++){
            // swapped=false;
            
            // for each steps, max item will come at last position.
            for(int j=1;j<arr.length-i;j++){
                
                // swap if item is smaller that prev item.
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Bubble(arr);
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}