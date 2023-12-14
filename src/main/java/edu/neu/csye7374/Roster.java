package edu.neu.csye7374;

import java.util.*;

public class Roster{
    private List<Student> registeredStudents = new ArrayList<>();
    private RosterFacade fileFacade;
    private String filePath;

    public Roster(String filePath) {
        this.filePath = filePath;
        this.fileFacade = new RosterFacade(new RosterFileUtil(), filePath);
        List<Student> savedData = fileFacade.loadRoster();
        if (savedData != null) {
            registeredStudents.addAll(savedData);
        }
    }
    //Method to register new Student
    public void register(Student newStudent) {
        boolean studentExists = false;
        for (Student student : registeredStudents) {
            if (student.getId().equals(newStudent.getId())) {
                studentExists = true;
                break;
            }
        }
        if (!studentExists) {
            registeredStudents.add(newStudent);
            fileFacade.saveRoster(registeredStudents);
        } else {
            System.out.println("\nStudent already exists!");
        }
    }

    public void getRegisteredStudents() {
        System.out.println("\nRegistered Student:");
        for (Student student: registeredStudents) {
            System.out.println("\nFirst Name: "+student.getFirstName()+"\tLast Name: "+student.getLastName()+"\tID: "+student.getId());
        }
    }
}
