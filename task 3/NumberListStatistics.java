import java.util.ArrayList;

public class NumberListStatistics {
    void main(String[] args){

        ArrayList<Integer> number=new ArrayList<>();
        number.add(0);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);
        number.add(-1);
        number.add(-2);
        number.add(-3);
        number.add(-4);
        number.add(-5);
        number.add(-6);
        number.add(-7);
        number.add(-8);
        number.add(-9);


        int totalSum=0;
        int numberEven=0;
        int numberOdd=0;
        int positiveNum=0;
        int negativeNum=0;
        int largestNum=number.get(0);
        int smallestNum=number.get(19);

        for(int num : number){
            totalSum += num;

            if (num %2 ==0) {
                numberEven++;
            }

                 else {
                numberOdd++;
            }

                if (num > 0) {
                    positiveNum++;
                } else {
                    negativeNum++;

                    if (num > largestNum) {
                        largestNum = num;

                    }
                    if (num < smallestNum) {
                        smallestNum = num;

                    }

                int average = totalSum / number.size();
                IO.println("All numbers in the list");

                       // for( int num: number){
                            IO.println(num + " ");
                            IO.println(totalSum + "Sum of numbers: ");
                            IO.println( average+ "the average value: ");
                            IO.println(largestNum+ " the largest number: ");
                            IO.println(smallestNum + "the smallest number: ");
                            IO.println(numberEven + "the count of even Number: ");
                            IO.println(numberOdd + "the count of odd Number ");
                            IO.println(positiveNum + "the count of positive Number ");
                            IO.println(negativeNum + "the count of negative Number ");

                    }
                }
            }
        }




