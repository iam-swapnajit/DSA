package dsa.slidingwindow;

public class FindMaximumSumSubArrayWithSizeK {
    public static void main(String[] args) {
        int[] arr = {200,300};
        System.out.println(findMaximumSum2(arr, 3));
    }

    public static int findMaximumSum(int[] arr , int k){
        if (arr == null || k <= 0 || arr.length < k)
            throw new IllegalArgumentException("Invalid input");
        int maxSum = 0;
        int sum = 0 ;

        for(int i=0 ; i<k ; i++){
            sum += arr[i];
        }
        maxSum = sum;
        //sliding window
        for(int i=k ; i< arr.length ; i++){
            sum = sum - arr[i-k] + arr[i];

        }
        maxSum = Math.max(maxSum, sum);
        return maxSum;
    }

    public static int findMaximumSum2(int[] arr , int k){
        if (arr == null || k <= 0 || arr.length < k)
            throw new IllegalArgumentException("Invalid input");
        int maxSum = 0;
        int sum = 0 ;

        for(int i=0 ; i<k ; i++){
            sum += arr[i];
        }

        int low =0;
        int high =k-1;
        //sliding window
        while(true){
            maxSum = Math.max(maxSum, sum);
            low++;
            high++;
            if(high == arr.length) break;
            sum = sum + arr[high] - arr[low-1];
        }

        return maxSum;
    }
}
