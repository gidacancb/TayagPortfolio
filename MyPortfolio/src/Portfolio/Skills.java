package Portfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Skills extends BaseFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skills frame = new Skills();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Skills() {
        super();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBack = new JLabel(" ");
		lblBack.setBounds(1024, 0, 46, 55);
		lblBack.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\exit.png"));
		contentPane.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					 HomeScreen wf = new HomeScreen();
			            wf.setVisible(true); 
			            Skills.this.dispose();
				
			}
		});
			
		JLabel lblPage = new JLabel(" ");
		lblPage.setBackground(new Color(52, 65, 142));
		lblPage.setSize(1080, 720);
		lblPage.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\skills.png"));
		contentPane.add(lblPage);
	}
}

