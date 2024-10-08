/* Find the peek element which is not smaller than its neighbours
 * 
 * time complexity :O(n)
 * space complexity :O(1)
 * 
 * procedure : 
 *  step1 : if first element is greater than second and last element is 
 *          greater than second last element  thejn print the respective
 *          element and terminate the program 
 *  Step 2: else traverse the array from second index to second last element .
 *          if an element array[i] is greater than array[i-1] and array[i+1] then
 *          print the position . 
 *            */
class FindPeek{
   int findpeek(int arr[],int size){
      // if the given input array is strictly shorted either increasing or decreasing order 
       if(size==1)
         return 0;
       if(arr[0]>=arr[1])
         return 0;
       if (arr[size-1]>=arr[size-2])
         return size-1;
      // if the peek element in between second element to second last element 
       for(int i=1; i<size-1;i++){
         if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
          return i;
       }

       return 0;
   }
}
public class Program2 {
   public static void main(String[] args) {
      // define an array
      int arr[]={10, 20, 15, 2, 23, 90, 67};
      int n=arr.length;
   FindPeek ob= new FindPeek();
   int pos=ob.findpeek(arr,n); 
   System.out.println(arr[pos]);     
   }
}
