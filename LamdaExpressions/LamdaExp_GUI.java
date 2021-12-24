package LamdaExpressions;
import java.awt.*;
public class LamdaExp_GUI {

	public static void main(String[] args) {
		//GUI using lambda expression
		Frame frame = new Frame ("Hacker");
		Button button = new Button("Option1 ");
		
		//button1
		button.setBounds(20, 30, 100,150);
		
		button.addActionListener(b->
		System.out.println("option 1 is selected"));
		//button2
		Button but = new Button("Option 2");
		but.setBounds(50,60,200,350);
		but.addActionListener(c->
		System.out.println("option 2 is selected"));
		frame.add(button);
		frame.add(but);
		frame.setSize(60,60);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}

}
