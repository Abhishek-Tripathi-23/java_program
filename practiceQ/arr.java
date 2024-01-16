package practiceQ;

import java.util.*;

public class arr {
    public static void main(String[] args) {
     
      
      int[] arr = {0,0,1,1,1,2,3,4,4,5};
      int n = arr.length;
      int[] arr1 = new int[n];
  
   int i=1;
   int k=0;
   while(i<n) {
	   
	   int j = i - 1;
	   arr1[k]=arr[j];
	   while(j<n) {
		   if(arr[i]==arr[j]) {
			   j++;
		   }
		   else {
			   i=j;
			   k++;
			   break;
		   }
	   }
   }
   for(int r=0; r<k; r++) {
	   System.out.println(arr1[r]);
   }
}
}