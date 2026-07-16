public class test1 {
    public static void main(String[] args) {
        String name = IO.readln("Enter Your Name :\n");
        IO.println("Hello world" + name);
        IO.println("size of string" + name.length());

        for (int i=name.length()-1 ; i>=0 ; i--) {

            IO.println(i + " " + name.charAt(i));
        }
    }
}
