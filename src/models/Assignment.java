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
 */
public class Assignment implements Comparable<Assignment> {
    private String title;
    private LocalDate dateOfSub;

    public Assignment() {
    }

    public Assignment(String title, LocalDate dateOfSub) {
        this.title = title;
        this.dateOfSub = dateOfSub;
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

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", dateOfSub=" + dateOfSub + '}';
    }

    @Override
    public int compareTo(Assignment a) {
        int last = this.dateOfSub.compareTo(a.getDateOfSub());
        return(last);
    }
    
    
    
}
