package Oops;
import java.util.Scanner;

class Complex
{
    int real, imaginary;

    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex other) 
    {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    Complex subtract(Complex other)
    {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    Complex multiply(Complex other)
    {
        int realPart = this.real * other.real - this.imaginary * other.imaginary;
        int imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    void print(String operation)
    {
        System.out.println(operation + ": " + real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i");
    }
}

public class ComplexCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real and imaginary parts for the first complex number:");
        Complex num1 = new Complex(scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter real and imaginary parts for the second complex number:");
        Complex num2 = new Complex(scanner.nextInt(), scanner.nextInt());

        num1.add(num2).print("Sum");
        num1.subtract(num2).print("Difference");
        num1.multiply(num2).print("Product");

        scanner.close();
    }
}

