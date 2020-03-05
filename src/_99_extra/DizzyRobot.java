//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
			
			
				
			
			
			
		String answer= JOptionPane.showInputDialog("On a scale of 1-10, how dizzy do you want robot to be?");
		int number = Integer.parseInt(answer);
		for (int i = 0; i < number; i++) {
 // 1. Use the dance method to make the robot spin.
			for (int a = 0; a < number; a++) {
				robot.setSpeed(100);
				robot.turn(360);
			}

	}
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

