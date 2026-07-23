import java.util.Scanner;

public class CircleCalculator {
    void main(String[] args) {
        double pi = 3.14;
        double radius;
        double area = 0;
        double circumference = 0;
        String classification = " ";

        Scanner scanner = new Scanner(System.in);
        IO.println("Enter the radius");
        radius = scanner.nextDouble();
        if (radius <= 0) {
            IO.println("Invalid radius. Radius must be greater than zero");
        } else {
            area = pi * radius * radius;
            circumference = 2 * pi * radius;

            if (radius < 5) {
                classification="Small circle";
            } else if (radius >= 15) {
                classification="Medium Circle";
            } else {
               classification= "Larg Circle";
            }

        IO.println("radius:" + radius);
        IO.println("area:" + area);
        IO.println("circumference:" + circumference);
        IO.println("classification:" + classification);

    }
        //Scanner.close();

    }

}







