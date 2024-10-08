//write a program to add two complex number.
import java.util.Scanner;
class ComplexNumber {
    double real;
    double imaginary;
    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }
    
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class Program21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 real and imaginary value:");
        double num1_real=sc.nextDouble();
        double num1_imaginary=sc.nextDouble();
        System.out.println("Enter num2 real and imaginary value:");
        double num2_real=sc.nextDouble();
        double num2_imaginary=sc.nextDouble();
        ComplexNumber num1 = new ComplexNumber(num1_real,num1_imaginary);
        ComplexNumber num2 = new ComplexNumber(num2_real,num2_imaginary);
         ComplexNumber sum = num1.add(num2);//object passing as a argument
         sc.close();
        
        System.out.println("Sum: " + sum); 
    }
}
