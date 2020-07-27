
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mac
 */
public class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        /* 
      * Sorting by age. compareTo should return < 0 if this(keyword) 
      * is supposed to be less than s, > 0 if this is supposed to be 
      * greater than object s and 0 if they are supposed to be equal.
      */
     int last = this.age.compareTo(s.getAge());
     return(last);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}
