package edu.neu.csye7374;

import java.io.*;
import java.util.*;

public class RosterFileUtil implements RosterAPI<Student> {
    private File file;

    @Override
    public void openRoster(String filePath) {
        file = new File(filePath);
        System.out.println("Roster file is successfully opened.");
    }

    @Override
    public List<Student> readRoster() {
        List<Student> roster = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length >= 3) {
                    Student student = new Student(fields[0], fields[1], fields[2]);
                    roster.add(student);
                }
            }
            System.out.println("Roster is successfully read from file.");
        } catch (IOException e) {
            System.out.println("Error occurred while reading roster from file.");
            e.printStackTrace();
        }
        return roster;
    }

    @Override
    public void writeRoster(List<Student> roster) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Student student : roster) {
                String line = student.getFirstName() + "," + student.getLastName() + "," + student.getId();
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Roster is successfully saved to file.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving roster to file.");
            e.printStackTrace();
        }
    }

    @Override
    public void closeRoster() {
        System.out.println("Roster file is successfully closed.");
    }
}