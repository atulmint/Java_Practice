Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2


OPTIMAL: Simple hai count operator rakh ke loop pe iterate kar ke count kar lenge
         and maths function me store kar lenge

Code: 

int cnt = 0;
int maxi = 0;
for(int i=0; i<nums.length; i++){
if(nums[i]==1){
                     count++;
                     maxi=Math.max(maxi,cnt);}
 else{cnt=0;}                    
 }
return maxi;