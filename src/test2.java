public class test2 {
}
    public static void main (String [] args){
        String name= IO .readln("Enter Your Name :\n");
        IO.println("Hello world" + name);
        IO.println("size of string" +name.length());

        for (int i=0 ; i< name.length();i++){

        IO.println(i + " " +name.charAt(i));
    }
}
