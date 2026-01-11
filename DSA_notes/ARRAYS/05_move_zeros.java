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