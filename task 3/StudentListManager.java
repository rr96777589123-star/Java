import java.util.ArrayList;

public class StudentListManager {
    void main (String [] args){
   ArrayList<String> students= new ArrayList<>();
        students.add("Reem");
        students.add("Taqwa");
        students.add("Noor");
        students.add("Ali");
        students.add("Omar");
        students.add("Salim");
        students.add("Salema");
        students.add("Mera");
        students.add("Sami");
        students.add("Salwa");

        IO.println("Student list:");
        for(String student : students){
            IO.println(student);
        }
        IO.println("total number of students: " +students.size());
        IO.println("First student in the list: " +students.get(0));
        IO.println("Last student in the list: " +students.get(9));

        String searchName="Reem";
        if(students.contains(searchName)){
            IO.println(searchName + " " + "exist in the list");

        }
        else{
            IO.println(searchName+ " " +"Not exist in the list");
        }

        String removeName="Ali";
        students.remove(removeName);
        IO.println(removeName+ " " + "is removed");

        IO.println("updated list:");
        for(String student : students) {
            IO.println(student);

        }


    }
}
