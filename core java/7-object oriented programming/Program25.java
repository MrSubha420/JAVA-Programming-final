//Example of association

/* In Java programming, a many-to-many relationship in association refers to a situation
   where multiple instances of one class are associated with multiple instances of another class.
   To demonstrate this, let's consider a simple example using the classes Student and Course.

   We'll assume that one student can enroll in multiple courses,
   and one course can have multiple students enrolled. To model this many-to-many relationship,
   we'll use a third class called Enrollment to represent the association between students and courses. 
   */

//It defines the many-to-many relationship.
import java.util.ArrayList;
import java.util.List;

class Student1 {
    private int studentId;
    private String name;
    private List<Enrollment1> enrollments;

    public Student1(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrollments = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Enrollment1> getEnrollments() {
        return enrollments;
    }

    public void addEnrollment(Enrollment1 enrollment) {
        enrollments.add(enrollment);
    }
}

class Course1 {
    private int courseId;
    private String courseName;
    private List<Enrollment1> enrollments;

    public Course1(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrollments = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Enrollment1> getEnrollments() {
        return enrollments;
    }

    public void addEnrollment(Enrollment1 enrollment) {
        enrollments.add(enrollment);
    }
}

class Enrollment1 {
    private Student1 student;
    private Course1 course;

    public Enrollment1(Student1 student, Course1 course) {
        this.student = student;
        this.course = course;
    }

    public Student1 getStudent() {
        return student;
    }

    public Course1 getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return student.getName() + " enrolled in " + course.getCourseName();
    }
}


public class Program25 {
    public static void main(String[] args) {
        // Creating students
        Student1 student1 = new Student1(1, "Subhadip");
        Student1 student2 = new Student1(2, "Souvik");

        // Creating courses
        Course1 course1 = new Course1 (101, "C.S.E");
        Course1 course2 = new Course1(102, "CiVil");

        // Creating enrollments
        Enrollment1 enrollment1 = new Enrollment1(student1, course1);
        Enrollment1 enrollment2 = new Enrollment1(student1, course2);
        Enrollment1 enrollment3 = new Enrollment1(student2, course1);

        // Adding enrollments to students and courses
        student1.addEnrollment(enrollment1);
        student1.addEnrollment(enrollment2);
        student2.addEnrollment(enrollment3);

        course1.addEnrollment(enrollment1);
        course1.addEnrollment(enrollment3);
        course2.addEnrollment(enrollment2);

         // Printing student's courses
         System.out.println(student1.getName() + "'s Courses:");
         for (Enrollment1 enrollment : student1.getEnrollments()) {
             System.out.println(enrollment);
         }
         System.out.println("...................................");
         System.out.println(student2.getName() + "'s Courses:");
         for (Enrollment1 enrollment : student2.getEnrollments()) {
             System.out.println(enrollment);
         }
         System.out.println();
 
         // Printing course's students
         System.out.println(course1.getCourseName() + "'s Students:");
         for (Enrollment1 enrollment : course1.getEnrollments()) {
             System.out.println(enrollment);
         }
         System.out.println(".....................................");
         System.out.println(course2.getCourseName() + "'s Students:");
         for (Enrollment1 enrollment : course2.getEnrollments()) {
             System.out.println(enrollment);
         }
    }
}

