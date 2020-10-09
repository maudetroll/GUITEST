import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuFenster {
	
	public static void main(String[] args) {
		new MenuFenster().starteX();
	}
	public void starteX() {
		JFrame frame= new JFrame("TextBox");
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("TextBox");
		frame.setSize(800,400);
		
		JPanel jp= new JPanel(new FlowLayout());
		frame.setContentPane(jp);
		
		// Änderung kommt hier rein
		MenuBar menuLeiste=  new MenuBar();
		
		Menu ersterReiter= new Menu("erster Reiter");
		Menu zweiterReiter= new Menu("zweiter Reiter");
		Menu dritterReiter= new Menu("dritter Reiter");
		
		MenuItem mi= new MenuItem("Forderung anzeigen");
		MenuItem mi2= new MenuItem("Auf Gut Glück Suche");
		
		MenuItem m1a= new MenuItem("Hilfe anzeigen");
		MenuItem m1b= new MenuItem("Einstellungen öffnen");
		MenuItem m2a= new MenuItem("Fenster schließen");
		
		m2a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		
		ersterReiter.add(mi);
		ersterReiter.add(mi2);
		
		zweiterReiter.add(m1a);
		zweiterReiter.add(m1b);
		
		dritterReiter.add(m2a);
		
		Button b= new Button("Beenden");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		
		menuLeiste.add(ersterReiter);
		menuLeiste.add(zweiterReiter);
		menuLeiste.add(dritterReiter);
		
		
		jp.add(b);
		
		frame.setMenuBar(menuLeiste);
		frame.pack();
		frame.setContentPane(jp);
	}
}
