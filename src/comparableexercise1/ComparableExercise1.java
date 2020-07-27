/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableexercise1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.Assignment;
import models.Course;
import models.CourseStudentWithAssignments;
import models.Student;

/**
 *
 * @author mac
 */
public class ComparableExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        
        List<Student> studentList = new ArrayList<>();
//        studentList.add(st1);
        studentList.add(new Student("AAA", 20)); // st2
        studentList.add(new Student("ABC", 10)); // st3
        studentList.add(new Student("ADD", 5));
        studentList.add(new Student("AFG", 12));
        studentList.add(new Student("AKM", 52));
        studentList.add(new Student("ALO", 42));
        
        Collections.sort(studentList); // st2.compareTo(st3)
        for (Student student : studentList) {
            System.out.println(student);
        }
        
        LocalDate ld = LocalDate.now();
        
        List<Assignment> assesList = new ArrayList<>();
        assesList.add(new Assignment("A1", ld.plusDays(2), 5));
        assesList.add(new Assignment("A2", ld.plusDays(-11), 7));
        assesList.add(new Assignment("A3", ld.plusDays(4), 4));
        assesList.add(new Assignment("A4", ld.plusMonths(2), 1));
        Collections.sort(assesList);
        for (Assignment a : assesList) {
            System.out.println(a);
        }
        
        
        
        // question 4
        List<Assignment> asses2 = new ArrayList<>();
        asses2.add(new Assignment("A1", ld.plusDays(2), 5));
        asses2.add(new Assignment("A2", ld.plusDays(2), 7));
          
        
        Course c1 = new Course("C1");
        List<CourseStudentWithAssignments> courseStudents = new ArrayList<>();
        courseStudents.add(new CourseStudentWithAssignments(new Student("AAA", 20), c1, asses2));
        
        asses2 = new ArrayList<>();
        asses2.add(new Assignment("A1", ld.plusDays(2), 2));
        asses2.add(new Assignment("A2", ld.plusDays(2), 9));
        courseStudents.add(new CourseStudentWithAssignments(new Student("BBB", 20), c1, asses2));
        
        asses2 = new ArrayList<>();
        asses2.add(new Assignment("A1", ld.plusDays(2), 8));
        asses2.add(new Assignment("A2", ld.plusDays(2), 9));
        courseStudents.add(new CourseStudentWithAssignments(new Student("CCC", 20), c1, asses2));
        Collections.sort(courseStudents);
        for (CourseStudentWithAssignments courseStudent : courseStudents) {
            System.out.println(courseStudent);
        }
        
    }
    
}
