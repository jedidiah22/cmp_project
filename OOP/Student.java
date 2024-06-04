package OOP;

public class Student extends User {
    String matric_no = "BHU/22/04/05/0131";
    String admission_no = "1024354678";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 8Bs, 3Cs ";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John Jedidiah";
        student.password = "John_Jedidiah1";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}