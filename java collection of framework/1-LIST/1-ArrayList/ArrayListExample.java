import java.util.*;
class ArrayListExample{
    public static void main (String arr[]){
        // creating integer type arraylist
        ArrayList<Integer> list = new ArrayList<>();
        // method:1 add method used for adding elements list
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(67);
        System.out.println("list:"+list);
        /* 
        //method:2 add(int index,element e): insert the new element from specific position
        list.add(2,10);
        System.out.println("after added element specific position");
        System.out.println("list:"+list);
        List<Integer> list1 = new ArrayList<>() ;
        // add elements list1
        list1.add(4);
        list1.add(9);
        System.out.println("List1:"+list1);
        //method:3 addAll(collection list1): append list1 after list
        list.addAll(list1);
        System.out.println(list); 
        List<Integer> list2 = new ArrayList<>() ;
        // add elements list1
        list2.add(25);
        list2.add(39);
        System.out.println("List1:"+list2);
        //method:4 addAll(index,collection): adding the new collection at specific position of list
        list.addAll(1, list2);
        System.out.println(list); 
        // method:5 clear() methods used to deletes all the elements from thislist
        list.clear();
        System.out.println(list);
        //method:6 clone(): return a copy of ArrayList interface
        ArrayList<Integer> clonelist=(ArrayList<Integer>)list.clone();
        System.out.println(clonelist);
        //method:7 contains(object o): checking the element present or not
        boolean b=list.contains(8);
        if(b)
        {
            System.out.println("this element present this list");
        }
        else{
            System.out.println("this element not present this list"); 
        }
        //method:8 ensureCapacity(int minCapacity): this method used to increase the capacity of ArrayList instance
        for(int i=0;i<100;i++){
            list.add(i);
        }
        System.out.println(list);
        list.ensureCapacity(12);
        System.out.println(list); 
        //method:9 forEach(consumer <! Super E> action): perform the given action for each elements itaratively
        //#loop1
        //method :10 indexOf(element e): return the index of this element from this list
        list.forEach((e)->{
             System.out.println("element"+list.indexOf(e)+":"+e);
            }); 
        //method 11: get(int index): return the element from this list ,perticuler index position
        //method 12: size(): return the total numbers of elelements present this list
        // #loop2
        for(int i=0;i<list.size();i++){
            System.out.println("index"+i+":"+list.get(i));
        }   
        //method13: isEmpty(): checking the list is empty or not; return true if the list is empty otherwise return false
        boolean b =list.isEmpty();
        if(b)
        {
            System.out.println("This is empty list");
        } 
        else{
            System.out.println("This is not a empty list");
        } 
        //Method 14:iterator() Return an iterator over the elements in this list in proper sequece
        //#loop3
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator :"+it.next());
        }*/
        //Method 15:
    }
    
}