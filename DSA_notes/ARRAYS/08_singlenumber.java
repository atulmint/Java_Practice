Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

BRUTE : Brute is so simple use pointer and count if count is 1 then return num

int cnt = 0;
for(int i=0; i<n; i++){
    number = nums[i];
    for(int j=0; j<n; j++){
        if(nums[j]==number){
            cnt++;
        }
        if(cnt==1){
            return nums;
        }
    }
}

Optimal: Optimal is so easy used the xor operation

int xorr =0;
for(int i=0; i<n; i++){
    xorr= xorr^nums[i];
}
return xorr;