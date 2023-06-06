package Portfolio;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HomeScreen extends BaseFrame {

	private JPanel contentPane;

	  public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    HomeScreen frame = new HomeScreen();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    public HomeScreen() {
	    	 super();
	         contentPane = new JPanel();
	         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExit = new JLabel(" ");
		lblExit.setBounds(1024, 0, 56, 52);
		lblExit.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\exit.png"));
		contentPane.add(lblExit);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this program?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					HomeScreen.this.dispose();
				}
			}
		});
		
		JLabel lblInterests = new JLabel(" ");
		lblInterests.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\interestbtn.png"));
		lblInterests.setBounds(699, 391, 308, 94);
		contentPane.add(lblInterests);
		lblInterests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		
					
					 Interests wf = new Interests();
			            wf.setVisible(true); 
			            HomeScreen.this.dispose();
				
			}
		});
		
		JLabel lblEducation = new JLabel(" ");
		lblEducation.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\educationbtn.png"));
		lblEducation.setBounds(699, 233, 308, 94);
		contentPane.add(lblEducation);
		lblEducation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					 Education wf = new Education();
			            wf.setVisible(true); 
			            HomeScreen.this.dispose();
				
			}
		});
		
		
		JLabel lblSkills = new JLabel(" ");
		lblSkills.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\skillsbtn.png"));
		lblSkills.setBounds(699, 543, 308, 94);
		contentPane.add(lblSkills);
		lblSkills.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					 Skills wf = new Skills();
			            wf.setVisible(true); 
			            HomeScreen.this.dispose();
				
			}
		});
		
		
		
		JLabel LblPage = new JLabel(" ");
		LblPage.setSize(1080, 720);
		LblPage.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\page.png"));
		contentPane.add(LblPage);
			
	}
}