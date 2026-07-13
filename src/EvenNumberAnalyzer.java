public class EvenNumberAnalyzer {
    public static void main(String [] args) {
        int limit=20;
        int count=0;
        int sum=0;
        for (int i=1; i<=20; i++){
            if (i % 2 ==0){
                System.out.println(i);
                count++;
                sum +=i;

            }
        }

        System.out.println("total count of even number=" + count);
        System.out.println("total sum of even number=" + sum);


    }
}
