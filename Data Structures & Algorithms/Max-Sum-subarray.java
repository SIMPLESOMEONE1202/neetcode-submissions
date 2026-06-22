class Solution {
    public int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;

        int low = 0; // window ka starting pointer
        int high = k - 1; // window ka ending pointer

        int sum = 0;

        // pehli window ka sum nikal rahe hain
        for (int i = 0; i <= high; i++) {
            sum += arr[i];
        }

        int res = sum; // initial answer pehli window ka sum

        while (high < n) {

            // current window ke sum se answer update karenge
            res = Math.max(res, sum);

            low++;
            high++;

            // agar high array ke bahar chala gaya toh stop
            if (high == n) {
                break;
            }

            // purana element remove karenge
            sum = sum - arr[low - 1];

            // naya element add karenge
            sum = sum + arr[high];
        }

        return res;
    }
}
