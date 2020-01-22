package exercicePerso;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestFramAvecWindows extends JFrame implements ActionListener {

	private JLabel label;
	private JButton button;

	public TestFramAvecWindows() {
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		label = new JLabel("Ca marche!");
		add(label);

		button = new JButton("Appuie si tu l'ose!");
		add(button);
		button.addActionListener(this);
	}

	public static void main(String args[]) {
		TestFramAvecWindows test = new TestFramAvecWindows();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(400, 125);
		test.setTitle("Le test");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			setTitle("Ca marche encore!");
			label.setText("J'ai reussi!");
			button.setText("Ca change aussi!");
		}
	}
}
