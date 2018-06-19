package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Y=new Robot();
		// 5. Set your robot's pen down 
		Y.penDown();
		// 3. Set the robot to go at max speed (10)
		Y.setSpeed(200);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int w=0; w<75;w++) {
			// 7. Change the pen color to random
		Y.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			Y.move(5*w);
			// 2. Turn the robot 360/7 degrees to the right
		Y.turn(360/7);
			// 8. Set the pen width to i
			Y.setPenWidth(w);
	}
}
}