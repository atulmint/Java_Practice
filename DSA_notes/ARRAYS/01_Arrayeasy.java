/* 
 strivers:>>>>>>

 Question : FIND THE LARGEST ELEMENT IN AN ARRAY

 arr[] = [3,4,,1,5,2]

 
 BRUTE: Phele hum array ko sort kar lenge and jo last element hoga wahi toh hoga largest humara

 SORT
 [1,2,3,4,5] And return kar denge last element ko 

 code:>>

  Arrays.sort(arr);           // Sort the array
        return arr[arr.length - 1]; // Last element is the largest


TIME COMPLEXITY : O(nLOGn) Because of sorting


OPTIMAL SOLUTION : HUM PHELE ELEMENT KO HI LARGEST CONSIDER KAR LENGE AND FIR LOOP LAGA KE 
COMPARISON KAR LENGE 

CODE:>>>

int largest = arr[0];
for(int i=0; i<arr.length; i++){
if(arr[i] > largest){
largest = arr[i];
}

return largest;
}

This is the optimal solution and TC : O(N)




QUESTION 2 : FIND THE SECOND LARGEST ELEMENT IN AN ARRAY

BRUTE: Sort the array and return the second last element.

      Arrays.sort(arr);           // Sort the array
            return arr[arr.length - 2]; // Second last element is the second largest      

AGAR ARRAY ME DUPLICATE ELEMENTS HAIN TOH YE SOLUTION Sahi NHI HOGA
            arr[] = [1,2,4,7,7,5,3]
            SORTED ARRAY : [1,2,3,4,5,7,7]
            SECOND LARGEST ELEMENT : 5

            Toh phele array ko sort krege and 
            Arrays.sort(arr);           // Sort the array
            [1,2,3,4,5,7,7]
             
             largest = arr[arr.length - 1];

            for(int i=arr.length-2; i>=0; i--){
                if(arr[i] !=largest){
                seondLargest = arr[i];
                break;
                  }}
            return secondLargest;
TIME COMPLEXITY : O(NLOGN + N ) because of sorting





BETTER APPROCH : HUM PHELE LARGEST ELEMENT KO FIND KREGE
largest = arr[0];
for(int i=0; i<arr.length; i++){
if(arr[i] > largest){
largest = arr[i];
}
}     
secondLargest = Integer.MIN_VALUE;
for(int i=0; i<arr.length; i++){
    if(arr[i] > secondLargest && arr[i] != largest){
        secondLargest = arr[i];
    }
}
return secondLargest;   
TIME COMPLEXITY : O(N) + O(N) = O(2N) 





OPTIMAL SOLUTION : HUM PHELE DO VARIABLES LENGE largest and secondLargest     
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;    
for(int i=0; i<arr.length; i++){
    if(arr[i] > largest){
        secondLargest = largest;
        largest = arr[i];
    }
    else if(arr[i] > secondLargest && arr[i] != largest){
        secondLargest = arr[i];
    }
}
return secondLargest;   

TIME COMPLEXITY : O(N)





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


26. Remove Duplicates from Sorted Array

arr[]=[1,2,4,7,7,5,3]

OPTIMAL : 

simple hai dhekh first element humesa array ka unique hi hoga na aur hume array se duplicates hatane hai
so simple hai hum two pointer meathod ka use karege and fir element ko set kar denge 
and secong pointer ko iterate karwayege and check karege previous se ki not equal hai 
kya fir agar not equal hai toh toh stor kar denge I+1 matlb iterator bhada denge 

code :

int i =0;
for(int j=1; j<nums.length; j++){
    if(nums[i] != nums[j]){
        nums[i+1]= nums[j];
        i++;
    }
}
return i+1;
