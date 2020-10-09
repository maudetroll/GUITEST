import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Liste {
	
	public static void main(String[] args) {
		new Liste().starteX();
	}
	
	public void starteX() {
		JFrame frame= new JFrame("TextBox");
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("TextBox");
		
		JPanel jp= new JPanel(new FlowLayout());
		frame.setContentPane(jp);
		
		
		String[] contents= {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};
		// Änderung kommt hier rein
		JList<String> jList= new JList<>(contents);
		
		
		Button b= new Button("Beenden");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		
		jp.add(jList);
		jp.add(b);
		frame.pack();
		frame.setContentPane(jp);
	}
}
