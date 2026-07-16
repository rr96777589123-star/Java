public class NumberReversal {
    void main (String [] args){
        int number= 12345;
        int reverse=0;
        int digit;
        IO.println(number + " ");
        while (number != 0){
            digit= number % 10 ;
            reverse= reverse * 10 + digit;
            number= number/ 10;
           IO.print("reverse number :" + reverse + " ");
        }

        }
    }

