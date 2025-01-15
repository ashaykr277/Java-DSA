//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1509163780/

public class EvenDig {
    public static void main(String[] args) {
    int nums[]={123,43,5677,543};
    System.out.println(findNum(nums));
    }

    static int findNum(int[] nums){
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        // int numOfDigits=digit(num); or
        int numOfDigits=digitShortcut(num);     // this is optimized way
        if(numOfDigits%2==0){
            return true;
        }
        return false;

    }
    static int digit(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }


    // shortcut to find no.of digit, hence optimized way
    static int digitShortcut(int num){
        return (int)(Math.log10(num))+1;
    }
    
}
