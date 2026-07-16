public class PalindromeChecker {
    void main(String[] args) {
        int number = 1221;
        int orignalNumber = number;
        int reversedNumber = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
            IO.print("number: " + orignalNumber);
            if (orignalNumber == reversedNumber) {
                IO.println("The number is palindrome");
            } else {
                IO.println("The number is not palindrome");
            }
        }

    }




