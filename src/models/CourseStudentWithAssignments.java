/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author mac
 */
public class CourseStudentWithAssignments implements Comparable<CourseStudentWithAssignments> {
    private Student student;
    private Course course;
    private List<Assignment> assignments;
    private Float totalGrade;

    public CourseStudentWithAssignments() {
    }

    public CourseStudentWithAssignments(Student student, Course course, List<Assignment> assignments) {
        this.student = student;
        this.course = course;
        this.assignments = assignments;
        setTotalGrade();
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
        setTotalGrade();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    public Float getTotalGrade() {
        return totalGrade;
    }
    
    private void setTotalGrade() {
        Float sum = 0.0f;
        for (Assignment a : assignments) {
            sum += a.getGrade();
        }
        this.totalGrade = sum / this.assignments.size();
                
    }

    @Override
    public String toString() {
        return "CourseStudentWithAssignments{" + "student=" + student + ", course=" + course + ", assignments=" + assignments + '}';
    }

    @Override
    public int compareTo(CourseStudentWithAssignments o) {
        int last;
        last = this.getTotalGrade().compareTo(o.getTotalGrade());
        return(last);
    }
    
    
    
}
