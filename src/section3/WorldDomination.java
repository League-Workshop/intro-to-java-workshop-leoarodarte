package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know how to write in code?");
		// 2. If they say "yes", tell them they will rule the world.
if (code.equals("yes")){
		JOptionPane.showMessageDialog(null, "You're going to rule the world!");

} else {
	JOptionPane.showMessageDialog(null, "Good luck washing dishes!");
}
}
}