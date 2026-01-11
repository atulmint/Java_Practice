
MEDIUM: Given an integer array nums, rotate the array to the right by k steps, where k is non-negative
Input: nums = [1,2,3,4,5,6,7], k = 3 , N=7
Output: [5,6,7,1,2,3,4]

Brute : Yr brute me previous jaise humne temp me first 3 element store kar ke bakiyo
ko n-1 se khiska diya waise hi

T.C= O(n+d)

OPTIMAL : SIMPLE HAI DHEKH REVERSE FUNCTION BANA AND PHELE [NUMS,0,N-1] TAKK REVERSE KAR TOH [7,6,5,4,3,2,1] 
            AND FIR [NUMS,0,K-1] TAKK REVERSE KARR [5,6,7,4,3,2,1] AND FIR [NUMS,K,N-1] SE REVERSE KAR BUS THAT IT CODE DHEKH LE JYADA
            SMJH AYEGA

            private void reverse(int[] nums, int start, int end){
                while(start<end){
                    int temp = nums[start];
                    nums[start]=nums[end];
                    nums[end]=temp;
                    start++;
                    end--;
                }
            }

            public void rotated(int[] nums, int k){
                int n= nums.length;

                k= k%n;

                reverse(nums,0,n-1);
                reverse(nums,0,k-1);
                reverse(nums,k,n-1);
            }