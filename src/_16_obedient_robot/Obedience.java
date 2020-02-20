package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedience {
	static Robot obey = new Robot();
	public static void main(String[] args) {
		
		String answer = JOptionPane.showInputDialog("What shape do you want me to do.(Shapes are Square, Triangle ot Circle)");
		String color = JOptionPane.showInputDialog("What color?(Colors are Red, Green or Blue)");
		
		if (answer.equals("Square")) {
			drawSquare();
		}
		if (answer.equals("Triangle")) {
			drawTriangle();
		}
		if(answer.contentEquals("Circle")) {
			drawCircle();
			}
			
			
		}
	

	private static void drawSquare() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			
		}
		obey.penDown();
		obey.setSpeed(100);
		obey.move(90);
		obey.turn(90);
		obey.move(90);
	}
	private static void drawTriangle() {
		// TODO Auto-generated method stub
		obey.penDown();
		obey.setSpeed(100);
		obey.turn(90);
		obey.move(200);
		obey.turn(-120);
		obey.move(200);
		obey.turn(-120);
		obey.move(200);
	}
	private static void drawCircle() {
		//TODO Auto-generated method stub
		for (int i = 0; i < 360; i++) {
			obey.penDown();
			obey.setSpeed(1000);
			obey.turn(1);
			obey.move(1);
		}
	}
}
