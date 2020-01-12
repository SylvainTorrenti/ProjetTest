package tuto;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Dialog {

	public static void main(String[] args) {
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
		Object[] possibilities = { "ham", "spam", "yam" };
		Icon icon = null;
		String s = (String) JOptionPane.showInputDialog(frame, "Complete the sentence:\n" + "\"Green eggs and...\"");

		// If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
			setLabel("Green eggs and... " + s + "!");
			return;
		}

	}

	private static void setLabel(String string) {
		// TODO Auto-generated method stub

	}

}
