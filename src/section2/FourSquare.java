package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot Y = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
Y.setSpeed(200);
		// 5. Set the pen width to 5
Y.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for(int x=0; x<4; x++) {
			// 7. Set the pen color to random
	Y.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
	Y.turn(90);
	}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		// JOptionPane.showMessageDialog(null, "yay! you called the drawSquare()
		// method!");
		for (int i = 0; i < 4; i++) {
			Y.penDown();
			Y.move(200);
			Y.turn(90);
			Y.sparkle();
			Y.unSparkle();
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
