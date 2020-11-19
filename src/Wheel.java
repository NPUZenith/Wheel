import java.util.Scanner;

public class Wheel {

    double radius;

    Wheel(double radius)
    {
        this.radius = radius;
    }

    public static void main(String[] args)
    {
        System.out.println("Please provide a radius: ");
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();

        System.out.println(d);

        Wheel w = new Wheel(d);
    }
}
