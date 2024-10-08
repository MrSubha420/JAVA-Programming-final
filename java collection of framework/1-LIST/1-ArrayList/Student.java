
   //Create a Custom student type 
   public class Student {
    String name;
    int rollno;
    public Student(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "Student{"+"name='" +name + "," +"roll no="+ rollno +"}";
    }
}
