 public class DigitFrequencyCounter {
    void main(String[] args) {

        int number = 122333;
        int targetDigit = 3;
        int count = 0;
        int digit;
        int originalNumber = number;

        while (number > 0) {
            digit = number % 10;
            if (digit == targetDigit) {
                count++;
            }
            number = number / 10;
        }
        IO.println("Number: " + originalNumber);
        IO.println("Target Digit: " + targetDigit);
        IO.println("Frequency: " + count);
    }
}


