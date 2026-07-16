public class DigitCounter {
    void main(){
        int n=12345;
        int originalNumber=n;
        int count=0;
        int digit;
        while(n!=0){
            digit= n % 10 ;
            count++;
            n= n/ 10;

        }
IO.println("Number:" + originalNumber);

{
IO.println("count:" + count);
        }
    }
}
