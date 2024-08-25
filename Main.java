import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        List<String> studentIds = Arrays.asList("S1", "S2", "S3");
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie");

        String teacherId = "T1";
        String teacherName = "Dr. Smith";

        Controller controller = new Controller();

      
        StudyGroup studyGroup = controller.createStudyGroup(teacherId, teacherName, studentIds, studentNames);

       
        System.out.println("Teacher: " + studyGroup.getTeacher().getName());
        System.out.println("Students:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
