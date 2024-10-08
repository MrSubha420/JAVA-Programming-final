// find the largest three distinct element from the array 

// Expected time complexity is : O(n)
// Expected space complexity is : O(1)
class Largest3Elements{
   // function to define largest 3 element
   public  void print3Elements(int arr[],int n){
      int first,second,third;
      first=second=third=Integer.MIN_VALUE;
      // if the array contain less than three elements
      if(n<3){
         System.out.println("Please enter valid input ");
         return;
      }
      // itarate this steps
      for(int i=0;i<n;i++){
         // condition 1 : arr[current]>first 
         if(arr[i]>first){
            third=second;
            second=first;
            first=arr[i];
         }
         /*condition 2:  If arr[i] is in between first and
         second then update second  */
         else if(arr[i]>second){
            third=second;
            second=arr[i];
         }
         // condition 3: if arr[i] is greater than third then update third
         else if(arr[i]>third){
            third=arr[i];
         }
      }

      // print the three elements
      System.out.println();
      System.out.println("Three largest elements are :"+first+" "+second+" "+third);
   }
}
class Rrogram1{
   public static void main(String[] args) {
     Largest3Elements ob = new Largest3Elements(); 
     int array[]={3,6,90,34,23,78,99,12,35};
     int size=array.length;
     ob.print3Elements(array,size);
   }
}