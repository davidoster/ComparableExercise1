/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author mac
 * the total grade of all the registered students of a course
 * - HARD - 4
 */
public class Assignment implements Comparable<Assignment> {
    private String title;
    private LocalDate dateOfSub;
    private int grade;

    public Assignment() {
    }

    public Assignment(String title, LocalDate dateOfSub, int grade) {
        this.title = title;
        this.dateOfSub = dateOfSub;
        this.grade = grade;
    }

    public LocalDate getDateOfSub() {
        return dateOfSub;
    }

    public void setDateOfSub(LocalDate dateOfSub) {
        this.dateOfSub = dateOfSub;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", dateOfSub=" + dateOfSub + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Assignment a) {
        int last = this.dateOfSub.compareTo(a.getDateOfSub());
        return(last);
    }
}
