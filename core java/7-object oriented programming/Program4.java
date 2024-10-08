//Example of build in method in java.

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
     //string.length();
    System.out.println("string is : subhadip");
    String str="subhadip";
    int length=str.length();
    System.out.println("length of the string is:"+length);
    //Math.max();
    int a = 5;
    int b = 8;
    int maxNumber = Math.max(a, b);
    System.out.println("5 and 8");
    System.out.println("Maximum number: " + maxNumber);
    //Arrays.sort();
    int[] numbers = {5, 2, 8, 1, 4};
    Arrays.sort(numbers);
    System.out.println("Before sort: 5,2,8,1,4");
    System.out.println("Sorted array: " + Arrays.toString(numbers));
    


    }
   
}