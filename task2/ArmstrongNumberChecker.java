public class ArmstrongNumberChecker {
    void main(String[] args) {

        int number = 153;
        int originalNumber = number;
        int digit;
        int sum = 0;
        int count = 0;
        int temp = number;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp = number;
        while (temp > 0) {
            digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }
        System.out.println("Number: " + originalNumber);
        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
