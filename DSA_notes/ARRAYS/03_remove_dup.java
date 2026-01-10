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
