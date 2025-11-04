package com.codegnan.oopexamples;

import java.util.Scanner;

public class Profile {
	 String name;
	    int rollNumber;
	    int grade;

	    public Profile(String name, int rollNumber, int grade) {
	        if (name == null) {
	            System.out.println("Error: Name cannot be empty");
	            return;
	        }

	        if (rollNumber <= 0) {
	            System.out.println("Error: Roll number must be positive");
	            return;
	        }

	        if (grade < 1 || grade > 12) {
	            System.out.println("Error: Grade level must be between 1 and 12");
	            return;
	        }

	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;

	        showProfile();
	    }

	    // Method to display student details
	    public void showProfile() {
	        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        String name = sc.nextLine();
	        int rollNumber = sc.nextInt();
	        int grade = sc.nextInt();

	        
	        new Profile(name, rollNumber, grade);

	        sc.close();
	    }
}
