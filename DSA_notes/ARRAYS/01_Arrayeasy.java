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