package com.codegnan.oopexamples;

import java.util.Scanner;

public class Student1 {
	Scanner sc=new Scanner(System.in);
	int rollNumber;
	String name;
	 int[] marks = new int[3];
	    Student1() {
	        name = "Unknown";
	        rollNumber = 0;
	        marks[0] = 0;
	        marks[1] = 0;
	        marks[2] = 0;
	    }

	   
	    Student1(String name, int rollNumber, int[] marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }

	   
	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.print("Marks: ");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.print(marks[i] + " ");
	        }
	        System.out.println();
	    }

	    int calculateTotal() {
	        int total = 0;
	        for (int i = 0; i < marks.length; i++) {
	            total += marks[i];
	        }
	        return total;
	    }

	    double calculateAverage() {
	        return (double) calculateTotal() / marks.length;
	    }


	    public static void main(String[] args) {
	        Student1 s1 = new Student1();
	        int[] marks = {85, 90, 80};
	        Student1 s2 = new Student1("Hari Vardhan", 1, marks);

	        System.out.println("---- Student 1 ----");
	        s1.displayDetails();
	        System.out.println("Total: " + s1.calculateTotal());
	        System.out.println("Average: " + s1.calculateAverage());

	        System.out.println();

	       
	        System.out.println("---- Student 2 ----");
	        s2.displayDetails();
	        System.out.println("Total: " + s2.calculateTotal());
	        System.out.println("Average: " + s2.calculateAverage());
	    }
	}
	
	

