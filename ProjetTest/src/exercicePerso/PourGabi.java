package exercicePerso;
/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 * @param fenêtre
 * 		création d'un programme avec fenêtre perso.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PourGabi extends JFrame implements ActionListener {

	private JLabel label;
	private JButton button;
	String userWord = "";

	public PourGabi() {
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		label = new JLabel("Gabi est fort à lol!");
		add(label);

		button = new JButton("La vérité");
		add(button);
		button.addActionListener(this);
	}

	public static void main(String[] args) {
		PourGabi test = new PourGabi();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500, 125);
		test.setTitle("Leona est le meilleur champion!");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			setTitle("Leona reste toujours le meilleur champion!");
			label.setText("C'est pas vrai il est que gold...");
		}
	}
}
