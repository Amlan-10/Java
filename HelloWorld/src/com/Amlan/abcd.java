package com.Amlan;

import java.util.Scanner;

public class abcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        KIITian[] students = new KIITian[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the student: ");
            String name = scanner.next();
            System.out.println("Enter the roll number of the student: ");
            int rollNumber = scanner.nextInt();
            System.out.println("Enter the registration number of the student: ");
            int registrationNumber = scanner.nextInt();
            System.out.println("Enter the course of the student: ");
            String course = scanner.next();
            students[i] = new KIITian(name, rollNumber, registrationNumber, course);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getName() + " " + students[i].getRollNumber() + " " + students[i].getRegistrationNumber() + " " + students[i].getCourse());
        }
    }//kjkjkjk;kj
}

class kiitStudent {
    private String name;
    private int rollNumber;
    private int registrationNumber;

    public kiitStudent(String name, int rollNumber, int registrationNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
}

class KIITian extends kiitStudent {
    private String course;

    public KIITian(String name, int rollNumber, int registrationNumber, String course) {
        super(name, rollNumber, registrationNumber, course);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}