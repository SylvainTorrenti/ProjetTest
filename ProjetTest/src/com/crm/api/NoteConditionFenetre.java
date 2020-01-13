package com.crm.api;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


	public abstract class NoteConditionFenetre extends JFrame implements ActionListener {

		private JLabel label;
		private JButton button;
		String userWord = "";

		public NoteConditionFenetre() {
			setLayout(new FlowLayout());
			setLocationRelativeTo(null);

			label = new JLabel("Gabi est fort à lol!");
			add(label);

			button = new JButton("La vérité");
			add(button);
			button.addActionListener(this);
		}
	
	
	

		public static void main(String[] args) {
		}
		}