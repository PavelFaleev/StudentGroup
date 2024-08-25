import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroup(String teacherId, String teacherName, List<String> studentIds, List<String> studentNames) {
    
        Teacher teacher = new Teacher(teacherId, teacherName);

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentIds.size(); i++) {
            students.add(new Student(studentIds.get(i), studentNames.get(i)));
        }

     
        return studyGroupService.createStudyGroup(teacher, students);
    }
}