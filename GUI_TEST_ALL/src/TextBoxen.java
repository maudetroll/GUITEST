import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextBoxen {
	
	public void starteX() {
		JFrame frame= new JFrame("TextBox");
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("TextBox");
		
		JPanel jp= new JPanel(new FlowLayout());
		frame.setContentPane(jp);
		
		// Änderung kommt hier rein
		JTextArea ta= new JTextArea();
		ta.setText("Das ist eine Seite");
		ta.setRows(4);
		
		Button b= new Button("Beenden");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		
		jp.add(ta);
		jp.add(b);
		frame.pack();
		frame.setContentPane(jp);
	}
}
