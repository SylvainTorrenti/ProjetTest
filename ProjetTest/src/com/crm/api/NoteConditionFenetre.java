package com.crm.api;

/**
 * @author Sylvain Torrenti
 * @version 1.0
 * @since 22/01/20
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NoteConditionFenetre extends JFrame implements ActionListener {

	private static JLabel label;

	String userWord = "";

	public NoteConditionFenetre() {
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		label = new JLabel("Vous êtes ajourné!");
		add(label);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserez votre note:");
		float note = sc.nextFloat();
		sc.close();
		if (note < 8) {
			NoteConditionFenetre test = new NoteConditionFenetre();
			test.setVisible(true);
			test.setSize(300, 80);
			test.setTitle("Resultat");

		} else {
			if (note < 12) {
				NoteConditionFenetre test = new NoteConditionFenetre();
				test.setVisible(true);
				test.setSize(300, 80);
				test.setTitle("Resultat avec mention");
				label.setText("Admis");
			} else {
				if (note < 14) {
					NoteConditionFenetre test = new NoteConditionFenetre();
					test.setVisible(true);
					test.setSize(300, 80);
					test.setTitle("Resultat avec mention");
					label.setText("Admis avec la mention AB");
				} else {
					if (note < 16) {
						NoteConditionFenetre test = new NoteConditionFenetre();
						test.setVisible(true);
						test.setSize(300, 80);
						test.setTitle("Resultat avec mention");
						label.setText("Vous êtes admis avec la mention B");

					} else {
						if (note >= 16) {
							NoteConditionFenetre test = new NoteConditionFenetre();
							test.setVisible(true);
							test.setSize(300, 80);
							test.setTitle("Resultat avec mention");
							label.setText("Vous êtes admis avec la mention TB");
						}
					}
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}