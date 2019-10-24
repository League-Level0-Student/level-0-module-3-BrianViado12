
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 12th";
		String dadsBirthday = "March 28th";
		String myBirthday = "April 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog("Do you want to find out your mom, dad's or your birthday?");
			
		if (answer.equals("mom")) {
			System.out.println(momsBirthday);
			}
			if (answer.equals("dad")) {
				System.out.println(dadsBirthday);
			}
			if (answer.equals("me")) {
				System.out.println(myBirthday);
			}
			if (answer.contentEquals("")) {
				JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday");
			}
		// 3. Print out what the user typed
			
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
