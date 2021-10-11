package com.assignment12;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]){
        List<Student> data=Student.getStudents();
        //1
        Stream<String> dept= data
                .stream()
                .map(Student::getEngDepartment)
                .distinct();
        dept.forEach(System.out::println);
        //2
        Stream<String> names=data
                .stream()
                .filter(student -> student.getYearOfEnrollment()>2018)
                .map(Student::getName);
        names.forEach(System.out::println);
        //3
        Stream<Student> males=data
                .stream()
                .filter(student -> student.getEngDepartment().equals("Computer Science"))
                .filter(student -> student.getGender().equals("Male"));
        males.forEach(student -> System.out.println(student.getGender()));
        //4
        Map<String,List<Student>> maleFemale = data
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println("Male ="+maleFemale.get("Male").size()+" Female ="+maleFemale.get("Female").size());

        //10
        Map<String,List<Student>> maleFemaleCs = data
                .stream()
                .filter(student -> student.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println("Male ="+maleFemaleCs.get("Male").size()+" Female ="+maleFemaleCs.get("Female").size());

        //5
        Optional<Integer> totalMaleAge= maleFemale.get("Male").stream()
                .map(Student::getPrage)
                .reduce((a,b)->a+b);
        Optional<Integer> totalFemaleAge= maleFemale.get("Female").stream()
                .map(Student::getPrage)
                .reduce((a,b)->a+b);
        System.out.println("male ="+totalMaleAge.get()/maleFemale.get("Male").size()+
                " female ="+totalFemaleAge.get()/maleFemale.get("Female").size());
        //6
         Optional<Float> maxper= data
                .stream()
                .map(Student::getPerTillDate).max((a,b)->(a>b)?1:-1);
         System.out.println(maxper.get());

        //7
        Map<String,List<Student>> deptStudents = data
                .stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment));
        for(String s:deptStudents.keySet()) System.out.println(s+": "+deptStudents.get(s).size());
        //8
        Map<String,List<Student>> deptwiseStd= data
                .stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment));
        for(String s:deptStudents.keySet()) {
            Optional<Float> fn = deptwiseStd.get(s).stream().map(Student::getPerTillDate).reduce((a,b)->a+b);
            System.out.println(s+": "+(float) fn.get()/deptwiseStd.get(s).size() );
        }
        //9
        Optional<Float> minEcePer= data
                .stream()
                .filter(student -> student.getEngDepartment().equals("Electronic"))
                .map(Student::getPerTillDate).min((a,b)->(a>b)?1:-1);
        System.out.println(minEcePer.get());
    }
}
