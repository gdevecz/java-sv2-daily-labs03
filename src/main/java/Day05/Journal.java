package Day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    List<String> students;

    public Journal() {
        students = new ArrayList<>();
    }

    public boolean addStudent(String studentName) {
        if (checkName(studentName)) {
            students.add(studentName);
            return true;
        }
        return false;
    }

    private boolean checkName(String studentName) {
        int indexOfSpace = studentName.indexOf(' ');
        if(indexOfSpace == -1 || indexOfSpace == 0 || indexOfSpace == studentName.length() - 1) {
            return false;
        }
        return true;
    }

    public List<String> getStudents() {
        return students;
    }
}
