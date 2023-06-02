import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        SchoolStudent schoolStudent = new SchoolStudent("x", "y", "z");
        CollegeStudent collegeStudent = new CollegeStudent("x", "y", "z");

        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}
