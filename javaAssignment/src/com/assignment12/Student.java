package com.assignment12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int prage;
    private String gender;
    private String engDepartment;
    private int yearOfEnrollment;
    private float perTillDate;

    public Student(int id, String name, int prage, String gender, String engDepartment, int yearOfEnrollment,
                   float perTillDate) {
        this.id = id;
        this.name = name;
        this.prage = prage;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public static List<Student> getStudents(){
        List<Student> arr=new ArrayList<>();
        arr.add(new Student(111, "Jiya Brein", 17, "Female",
                "Computer Science", 2018, 70.8f));
        arr.add(new Student(122, "Paul Niksui", 18, "Male",
                "Mechanical", 2016, 50.2f));
        arr.add(new Student(133, "Martin Theron", 17, "Male",
                "Electronic", 2017, 90.3f));
        arr.add(new Student(144, "Murali Gowda", 18, "Male",
                "Electrical", 2018, 80f));
        arr.add(new Student(155, "Nima Roy", 19, "Female",
                "Textile", 2016, 70f));
        arr.add(new Student(166, "Iqbal Hussain", 18, "Male",
                "Security", 2016, 70f));
        arr.add(new Student(177, "Manu Sharma", 16, "Male",
                "Chemical", 2018, 70f));
        arr.add(new Student(188, "Wang Liu", 20, "Male",
                "Computer Science", 2015, 80f));
        arr.add(new Student(199, "Amelia Zoe", 18, "Female",
                "Computer Science", 2016, 85f));
        arr.add(new Student(200, "Jaden Dough", 18, "Male",
                "Security", 2015, 82f));
        arr.add(new Student(211, "Jasna Kaur", 20, "Female",
                "Electronic", 2019, 83f));
        arr.add(new Student(222, "Nitin Joshi", 19, "Male",
                "Textile", 2016, 60.4f));
        arr.add(new Student(233, "Jyothi Reddy", 16, "Female",
                "Computer Science", 2015, 45.6f));
        arr.add(new Student(244, "Nicolus Den", 16, "Male",
                "Electronic", 2017, 95.8f));
        arr.add(new Student(255, "Ali Baig", 17, "Male",
                "Electronic", 2018, 88.4f));
        arr.add(new Student(266, "Sanvi Pandey", 17, "Female",
                "Electric", 2019, 72.4f));
        arr.add(new Student(277, "Anuj Chettiar", 18, "Male",
                "Computer Science", 2017, 57.5f));
        return arr;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrage() {
        return prage;
    }

    public String getGender() {
        return gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public float getPerTillDate() {
        return perTillDate;
    }
}
