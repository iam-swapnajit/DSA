package dsa.slidingwindow;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,1,3,7};
        int target = 9;
        System.out.println(findMinimumSizeSubArray(arr, target));
    }

    public static int findMinimumSizeSubArray(int[] arr, int target){

        int low = 0;
        int high = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        while(high < arr.length){
            sum = sum + arr[high];
            while(sum >= target){
                int len = high - low +1 ;
                res = Math.min(res, len);
                sum = sum - arr[low];
                low ++;
            }
            high++ ;
        }
        if(res == Integer.MAX_VALUE) return 0;
        return res;

    }
}
