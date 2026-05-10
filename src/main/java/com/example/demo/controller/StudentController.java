package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    // In-memory list
    private List<Student> students = new ArrayList<>();

    // CREATE
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        System.out.println("This is testing for jenkins build");
        return "Student Added Successfully";
    }

    // READ ALL
    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // UPDATE
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id,
                                @RequestBody Student updatedStudent) {

        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setMarks(updatedStudent.getMarks());
                return "Student Updated Successfully";
            }
        }

        return "Student Not Found";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return "Student Deleted Successfully";
            }
        }

        return "Student Not Found";
    }
}