package kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam ",new Teacher("Klaus Nauczyciel")));
        students.add((new Student("Bazyl ",new Teacher("Hieroni Nauczyciel"))));
        students.add(new Student("Max",null));
        students.add(new Student("Kris",null));




        for (Student student: students) {

            Optional<Teacher> optionalStudent = Optional.ofNullable(student.getTeacher());
            
            optionalStudent.ifPresentOrElse(
                    x -> System.out.println(optionalStudent),
                    () -> System.out.println(student.getName() + " <unnamed>"));
            //String teacherName = optionalStudent.orElse(Teacher.getName());
           // optionalStudent.orElse(student.teacher.getName());
            //System.out.println(optionalStudent);
            //System.out.println(student.getName() + student.teacher.getName());

        }

    }
}
