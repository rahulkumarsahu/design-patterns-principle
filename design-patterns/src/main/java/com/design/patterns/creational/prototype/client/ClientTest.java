package com.design.patterns.creational.prototype.client;

import com.design.patterns.creational.prototype.dao.StudentDAO;
import com.design.patterns.creational.prototype.dto.Student;

import java.util.List;

public class ClientTest {

    public static void main(String[] args) throws CloneNotSupportedException  {

        StudentDAO studentDAO = new StudentDAO();

        //Getting Original copy of student list
        List<Student> allStudents = studentDAO.getAllStudents();

        //Getting clone copy of student list
        List<Student> updatedStudentList = studentDAO.clone();
        Student student = new Student();
        student.setId(30);
        student.setName("SK");

        //Doing manipulation on cloned copy
        updatedStudentList.add(student);

        System.out.println("Original Student List::");
        allStudents.forEach(System.out::println);

        System.out.println("Updated Student List::");
        updatedStudentList.forEach(System.out::println);
    }


}
