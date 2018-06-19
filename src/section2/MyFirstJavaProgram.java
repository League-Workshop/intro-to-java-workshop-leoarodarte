package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot hippieChicken=new Robot();
		hippieChicken.setSpeed(150);	
		for(int i=0;i<10;i++) {
			hippieChicken.move(300);
			hippieChicken.turn(90);
			hippieChicken.miniaturize();
			hippieChicken.moveTo(300, 200);
			
		}
	}
}
