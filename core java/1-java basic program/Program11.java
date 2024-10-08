//Find the largest value from the array.
class Myclass{
    int max=0;
    void findMaxElement(int element)
    {
        if(max<element)
        {
            max=element;
        }
    }
    public void show(){
        System.out.println("max element from this array is: "+max);
    }
}
public class Program11 {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        int arr[]={1000,20,45,23,12,34,56,500,89,34,89,70,18,100};
        for(int i=0;i<arr.length;i++){
            obj.findMaxElement(arr[i]);
        }
        obj.show();
    }
}
