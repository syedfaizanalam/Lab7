package Lab7.src;

import java.util.Scanner;

/*
 * 
 * Lab 7 Starter Project
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		validateName(name);
		System.out.println("Please enter your email address.");
		String email = scnr.nextLine();
		validateEmail(email); 
		System.out.println("Please enter your phone number.");
		System.out.println("In ### ### #### format.");
		String phone;
		phone = scnr.nextLine();
		validatePhone(phone); 
		String date; 
		System.out.println("Please enter the date. MM/DD/YYYY");
		date = scnr.nextLine();
		validateDate(date);

	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z][A-Za-z ]{1,29}";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}
//[a-zA-Z]{5,30}@[a-zA-Z]{3,10}.[a-zA-Z]{2,3}
	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "[A-Za-z\\d.@_]{1,30}";
//[A-Za-z0-9]{5,30}@[A-Za-z0-9]{3,10}\\.[A-Za-z0-9]{2,3}
		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		boolean regex = phone.contentEquals("\\d\\d\\d \\d\\d\\d \\d\\d\\d\\d");

		if (phone.equals(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "[\\d/]{10}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	

}
