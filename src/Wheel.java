import java.util.Scanner;

public class Wheel {

    double radius;

    /*
     Allows the new wheel to pass in a variable named "radius".
     The second line is object oriented stuff that tells all of the other functions outside of main to use "radius" when running the commands.
    */
    Wheel(double radius)
    {
        this.radius = radius;
    }

    public static void main(String[] args)
    {
        System.out.println("Please provide a radius: ");
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();

        Wheel w = new Wheel(d); // Sends the scannered double "d" into the wheel constructor up top to count that as radius


        System.out.println("You circumference is " + w.getCircumference());
        System.out.println("You area is " + w.getArea());
    }

    double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    double getArea()
    {
        return Math.sqrt(radius) * Math.PI;
    }
}
