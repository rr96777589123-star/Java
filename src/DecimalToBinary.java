public class DecimalToBinary {
    void main (String [] args){
        int number=25;
        int orignalNum=number;
       String binary="";
       int reminder;
       while(number > 0){
           reminder= number%2;
           binary=reminder + binary;
           number= number / 2;
       }
       IO.println("Decimal Number=" + orignalNum);
        IO.println("Binary Number=" + binary);
    }
}
