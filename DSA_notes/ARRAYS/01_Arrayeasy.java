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


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


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

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

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


        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

OPTIMAL : SIMPLE APPROCH HAI TWO POINTER USE KAREGE J= -1 SE AND I KO FULL ITERATE KARWAYEGE AND JAHA I ==0 HOGA WAHA PE J=I KAR DENGE 
          MATLB J KO -1 SE AAGE BHADHA DENGE AND BREAK KAR JAYEGE NEXT LOOP ME I=J+1 SE SURU KAREGE AND CHECK KAREGE KI ARR[I]!=0 KE
          AGAR HA TOH SWAP KAR DENGE  AUR J++.

          Int j=-1;
          int n =nums.length;

          for(int i=0; i<n ; i++){
           if(arr[i]=0)
           j=i;
           break;
          }

          for(int i= j+1; i<n; i++){
          if(arr[i]!=0){
          int temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          j++
          }
          }

          T.C= O(n)         


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
  
  MISSING NUMBER IN ARRAY

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
