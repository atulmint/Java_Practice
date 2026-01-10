

Problem ka Goal
Hume check karna hai ki array pehle non-decreasing order me sorted tha
aur baad me usko kuch positions se rotate kiya gaya ho (ya zero rotation).

Main Observation
Sorted + rotated array me circularly compare karne par
order maximum ek hi baar break hota hai.

Order break ka matlab
nums[i] > nums[i+1]

Rules
Agar 0 baar break ho >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
array already sorted hai

Agar 1 baar break ho >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
array sorted + rotated hai

Agar 1 se zyada baar break ho >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
array valid nahi hai

Circular Check kyun zaroori hai
Rotation ki wajah se last element ka relation
first element ke saath bhi check karna padta hai.

Example
nums = [3, 4, 5, 1, 2]

Circular comparison
3 < 4
4 < 5
5 > 1  yaha ek break
1 < 2
2 < 3  last aur first ka check

Sirf ek break
Isliye array valid hai

Invalid Example
nums = [2, 1, 3, 4]

2 > 1  pehla break
1 < 3
3 < 4
4 > 2  doosra break

Do breaks mil gaye
Isliye array sorted + rotated nahi hai

Logic Simple Words me
Pure array me loop lagao
Har element ko next element se compare karo
Last element ke liye first element se compare karo
Jab bhi order break ho count badhao
Agar count 1 se zyada ho jaye to false return karo
Warna true return kar


code :-

int count = 0;
int n = nums.length;

for(int i=0; i<n; i++){

    if(nums[i] > nums[(i+1)%n])
    count++;
}

if(count>1) return false;
return true;