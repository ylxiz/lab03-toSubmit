
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        List<String> studentList = getStudents();
        
        for (String student : studentList) {
            System.out.println(student);
        }
    }
    


    public static List<String> getStudents() {
        List<String> students = new ArrayList<>();
        students.add("Abdulaziz, 1234, 3.8");
        students.add("Abdullah, 2345, 3.6");
        students.add("Mohammed, 3456, 3.9");
        students.add("ali, 3532, 2.8");
        
        return students;
    }
    
}
