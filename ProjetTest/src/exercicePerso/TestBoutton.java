package exercicePerso;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestBoutton extends JFrame implements ActionListener {
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	
	JButton myButton = new JButton("Appuie si tu l'ose");

	public static void main(String[] args) {
		
	}
	public  TestBoutton() {
		add(myButton);
		myButton.addActionListener(this);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == myButton) {
			setTitle("Ca marche!");
		}
	}

}
