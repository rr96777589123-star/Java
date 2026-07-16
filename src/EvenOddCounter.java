public class EvenOddCounter {
    void main(String[] args) {

        int start = 0;
        int end = 12;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i <= 12; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;

            }
        }
        IO.println("EVEN COUNT=" + evenCount);
        IO.println("ODD COUNT=" + oddCount);
    }
}