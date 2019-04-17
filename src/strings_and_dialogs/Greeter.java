package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		
	String name=	JOptionPane.showInputDialog("Hello, What is YOUR NAME?");
	
		JOptionPane.showMessageDialog(null, "Hello "+name);
	}
}
