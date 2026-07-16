public class FibonacciSequence {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next;
        int count;
        IO.println(first + " " + second + " ");
        for (count = 2; count <= 15; count++) {
            next = first + second;

            IO.println(next + " ");

            first = second;
            second = next;
        }
    }
}



