package com.demo.Student2.PathModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class PathModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String name;

    @Column
    String grade;
    
    @Column
    String department;

    public PathModel() {
    }

    public PathModel(int id, String name, String grade,String department) {
        super();
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.department=department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "PathModel [id=" + id + ", name=" + name + ", grade=" + grade + ",department= "+ department +" ]";
    }
}
