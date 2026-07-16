public class StudentGradeCalculator {
    void main(String[] args) {
        double grade1 = 90.5;
        double grade2 = 77;
        double grade3 = 50;
        String status;
        double average = (grade1 + grade2 + grade3 )/3;
        IO.println("grade1=" + grade1);
        IO.println("grade2=" + grade2);
        IO.println("grade3=" + grade3);

        IO.println("The Average:" + average);

        {
            if (average >= 90) {
            IO.println("status:Exelent");
        } else if
        (average <= 89) {
            IO.println("status: GOOD");
        } else if
        ( average <= 74) {
            IO.println("status: Pass");
        } else {
            IO.println("status: Fail");
        }

        }
    }


    }

