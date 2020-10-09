import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hauptfenster {
	
	public static void main(String[] args) {
		Hauptfenster h= new Hauptfenster();
		h.startX();
	}
	

	
	public void startX() {
		JFrame frame= new JFrame("TEST");
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("GUI Oberfl�chen TEST");
		
		Button jb= new Button("TextBoxen �ffnen");
		Button jList = new Button("jList �ffnen");
		Button jComboBox= new Button("JComboBox �ffnen");
		Button menu= new Button("Menu �ffnen");
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TextBoxen tb= new TextBoxen();
				tb.starteX();
				
			}
		});

		menu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuFenster m= new MenuFenster();
				m.starteX();
				
			}
		});
		
		jList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Liste l= new Liste();
				l.starteX();
				
			}
		});

		jComboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ComboBoxFenster cb= new ComboBoxFenster();
				cb.starteX();
				
			}
		});
		
		JPanel jp= new JPanel(new FlowLayout());
		jp.setSize(800,400);
		frame.setContentPane(jp);

		frame.getContentPane().add(jb);
		frame.getContentPane().add(jList);
		frame.getContentPane().add(jComboBox);
		frame.getContentPane().add(menu);
		
		frame.pack();
		frame.setContentPane(jp);
	}
}
