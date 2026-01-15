Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Brute : approch but simple hai two pointer approch use kar ke karege

code : for(int i=0; i<=n; i++){
    flag =0;

    for(int j=0; j<n; j++){
        if(arr[j]==i){
            flag=1;
            break;
        }
    }
     
     if(flag==0){
            return i;
        }

        return -1;
}

TIME COM : O(N*N)

OPTIMAL : Approch simple hai yaa toh sum use kar lo like sum = N*(N+1)/2 and sum of given arr and finsum = sum - arr

code : int sum = N*(N+1)/2;
       int arrsum = 0;
       for(int i=0; i<N; i++){
        arrsum = arrsum + nums[i];
       }
       return (sum-arrsum)

Clean code :

 class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;

        int sum = N * (N + 1) / 2;   // sum of range [0..N]
        int arrsum = 0;

        for (int i = 0; i < N; i++) {
            arrsum += nums[i];
        }

        return sum - arrsum;   // missing number
    }
}

ANOTHER OPTIMAL BEST FOR THIS QUESTION : HUM XOR OPERATION KAR LENGE PEHELE INDEX PE AND THEN ARRAY PE 

CODE : int n = nums.length;
       int xor = 0;

       for(int i =0; i<n; i++){
        xor ^= i;
        xor ^= nums[i];
       }
       xor ^=n;
       retrun xor;

clean code :
       
        class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= i;        // XOR index
            xor ^= nums[i]; // XOR array value
        }

        xor ^= n;            // include last number

        return xor;          // missing number
    }
}
