
// Example of Else-if lader
// Marks-----Division
// Greater than 79 ---Honours
// greater than 59----i division
//Greater than 49----ii division
//Less than 49---- fail
public class Prog9 {
    public static void main(String arr[])
    {
        int marks[]={81,75,43,58,98};
        int roll_number[]={101,102,104,105,106};
        int i;
        for(i=0;i<roll_number.length;i++)
        {
            if(marks[i]>79)
            {
                System.out.println(roll_number[i]+"--getting Honorus");
            }
            else if(marks[i]>59)
            {
                System.out.println(roll_number[i]+"-- getting i division");  
            }
            else if(marks[i]>49)
            {
                System.out.println(roll_number[i]+" -- getting ii division");  
            }
            else if(marks[i]<49)
            {
                System.out.println(roll_number[i]+"-- getting fail");  
            }

        }
    }
}
