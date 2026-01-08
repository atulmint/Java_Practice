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


*/