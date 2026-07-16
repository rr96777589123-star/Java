public class LargestNumberFinder {
    void main(String [] args){
        int[] number={10,55,12,16};
        int largestNumber= number[0];
        for(int i=1;i< number.length;i++){
            if (number[i]> largestNumber){
                largestNumber= number[i];
            }
        }
        IO.println("largest Number:" +largestNumber );
    }
}
