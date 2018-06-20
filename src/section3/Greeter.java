package section3;

import javax.swing.JOptionPane;

import sun.applet.Main;

public class Greeter{
public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "How are you doing "+ name +".");
}
}
