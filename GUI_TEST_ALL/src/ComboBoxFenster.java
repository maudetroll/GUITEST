import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ComboBoxFenster {
	
	public static void main(String[] args) {
		new ComboBoxFenster().starteX();
	}
	
	public void starteX() {
		JFrame frame= new JFrame("TextBox");
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("TextBox");
		
		JPanel jp= new JPanel(new FlowLayout());
		frame.setContentPane(jp);
		
		String [] liste= {"Januar", "Februar", "März","April","Mai","Juni", "Juli", "August","September", "Oktober","November","Dezember"};
		// Änderung kommt hier rein
		JComboBox<String> comboBox = new JComboBox<>(liste);
		
		Button b= new Button("Beenden");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		
		jp.add(comboBox);
		jp.add(b);
		frame.pack();
		frame.setContentPane(jp);
	}
}
