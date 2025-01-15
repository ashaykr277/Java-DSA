//https://leetcode.com/problems/richest-customer-wealth/submissions/1509183124/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4,5,6},{7,8,9}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int nums[][]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int rowsum=0;
            for(int j=0;j<nums[i].length;j++){
                rowsum+=nums[i][j];
            }
            //here comes out of inner loop;
            //now check with overall ans
            if(ans<rowsum){
                ans=rowsum;
            }
        }
        return ans;
    }
}

// or
// instead of creating 2D loop, simply can be written as this
// for(int[] ints:accounts){
    //     int rowsum=0;
    //     for(int Anint: ints){
    //         rowsum+=Anint;
    //     }