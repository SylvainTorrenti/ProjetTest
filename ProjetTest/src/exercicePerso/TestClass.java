package exercicePerso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TestClass {

		class GenerateurIdentifiantFenetre extends JFrame implements ActionListener{
			
			public static final long serialVersionUID = -5624404136485946868L;

			String userWord="";
			JTextField userInput;
			
			public GenerateurIdentifiantFenetre() {
				JFrame jf = new JFrame();
				JPanel panel = new JPanel();
				JLabel jl=new JLabel("test");
				JButton jButton = new JButton("click");
				userInput=new JTextField("",30);
				jf.setVisible(true);
				jButton.addActionListener((e)->{
					submitAction();
				});
				jf.setSize(500, 500);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.add(panel);
				panel.add(jl);
				panel.add(userInput);
				panel.add(jButton);
		}
			public void submitAction() {
				userWord = userInput.getText();
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			}

	}


