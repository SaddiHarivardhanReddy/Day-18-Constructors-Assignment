package com.codegnan.oopexamples;
import java.util.Scanner;

public class AttendanceSystem {
	    int id;
	    String name;
	    String status;

	    // Constructor with validation
	    public AttendanceSystem(int id, String name, String status) {
	        if (id <= 0) {
	            System.out.println("Error: ID must be positive");
	            return;
	        }

	        if (name == null) {
	            System.out.println("Error: Name cannot be empty");
	            return;
	        }

	        if (!(status.equals("Present") || status.equals("Absent"))) {
	            System.out.println("Error: Status must be \"Present\" or \"Absent\"");
	            return;
	        }

	        this.id = id;
	        this.name = name;
	        this.status = status;

	        displayAttendance();
	    }

	    
	    public void displayAttendance() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Status: " + status);
	    }

	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int id = sc.nextInt();
	        sc.nextLine(); 
	        String name = sc.nextLine();
	        String status = sc.nextLine();

	        new AttendanceSystem(id, name, status);

	        sc.close();
	}
}
