package edu.neu.csye7374;

public class Demo {

    public static void RosterDemo(){
        String filePath = "StudentList.txt";
        Roster roster = new Roster(filePath);
        Student alice = new Student("Alice","John","0010");
        Student brett = new Student("Brett","Alex","0011");

        //Current Student Roster
        roster.getRegisteredStudents();

        roster.register(alice);
        roster.register(brett);

        //Student Roster after adding new Students
        roster.getRegisteredStudents();


    }
}
