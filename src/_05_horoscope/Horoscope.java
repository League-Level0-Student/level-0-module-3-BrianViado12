package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String zodiac=JOptionPane.showInputDialog("What is your star sign?(Zodiac sign)");
	if (zodiac.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "You have the Ram! That represents Mars. Nice!");
	}
	if (zodiac.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "You have the Bull! That sign represents Venus. Cool");
	}
	if (zodiac.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "You have the Twins! That's the sign that represents Mercury.");
	}
	if (zodiac.equals("idk")) {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
}

}
