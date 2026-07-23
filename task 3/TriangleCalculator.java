import java.util.Scanner;

public class TriangleCalculator {
    void main(String[] args) {
        double base;
        double height;
        double area;
        double sideA;
        double sideB;
        double sideC;
        double perimeter;
        String tringleType;


            Scanner scanner = new Scanner(System.in);
            IO.println("Enter base:");
            base = scanner.nextDouble();

            IO.println("Enter height:");
            height = scanner.nextDouble();


            IO.println("Enter Side A:");
            sideA = scanner.nextDouble();

            IO.println("Enter Side B:");
            sideB = scanner.nextDouble();

            IO.println("Enter Side C:");
            sideC = scanner.nextDouble();

            if (base <= 0 || height <= 0 || sideA <= 0 || sideB <= 0 || sideC <= 0) {
                IO.println("Invalid input. All values must be greater than zero.");
            } else {

                area = (base * height) / 2;
                perimeter = sideA + sideB + sideC;


                if (sideA == sideB && sideB == sideC) {
                    tringleType = "Equilateral Triangle";
                } else if
                (sideA == sideB || sideA == sideC || sideB == sideC) {
                    tringleType = " Isosceles Triangle";
                } else {
                    tringleType = "Scalene Triangle";
                }
                IO.println("base:" + base);
                IO.println("height:" + height);
                IO.println("SideA:" + sideA);
                IO.println("SideB:" + sideB);
                IO.println("SideC:" + sideC);
                IO.println("area:" + area);
                IO.println("perimeter:" + perimeter);
                IO.println("tringle Type:" + tringleType);
            }
            scanner.close();
        }
    }


