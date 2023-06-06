package Portfolio;
import javax.swing.*;
import java.awt.*;

public class SplashScreen extends BaseFrame {

    private JLabel image = new JLabel(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\me.png"));
    private JLabel welcome = new JLabel(" ");
    private JProgressBar progressBar = new JProgressBar();
    private JLabel loading = new JLabel();
    private final JLabel lblBg = new JLabel(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\bg.gif"));

    public SplashScreen() {
        super();
        createGUI();
        addImage();
        addWelcome();
        addProgressBar();
        addLoading();
        runningPBar();
    }

    private void createGUI() {
        setUndecorated(true);  
        setSize(600, 400); 
        setLocationRelativeTo(null); 
        getContentPane().setBackground(new Color(255, 255, 255));  
        setVisible(true); 
        setResizable(false);  
    }

    private void addImage() {
        image.setLocation(302, 153);  
        image.setSize(288, 275);  
        getContentPane().add(image); 
    }

    private void addWelcome() {
        welcome.setIcon(new ImageIcon("C:\\Users\\Shaira Kei\\eclipse-workspace\\MyPortfolio\\Images\\font.png"));
        welcome.setBounds(48, 78, 600, 40);  
        getContentPane().add(welcome);  
    }

    private void addLoading() {
        loading.setBounds(224, 177, 200, 40);  //sets the location and size of the loading label
        loading.setForeground(Color.BLACK);  //sets the text color of the loading label
        loading.setFont(new Font("arial", Font.BOLD, 15));  // Sets the font of the loading label
        getContentPane().add(loading);  //adds the loading label to the content pane
        lblBg.setBounds(10, 11, 600, 400);  //sets the location and size of the background label
        getContentPane().add(lblBg);  //adds the background label to the content pane
    }

    private void addProgressBar() {
        progressBar.setBounds(87, 136, 400, 30);  //sets the location and size of the progress bar
        progressBar.setBorderPainted(true);  //sets whether the progress bar should have a border
        progressBar.setStringPainted(true);  //sets whether the progress bar should display a string
        progressBar.setForeground(new Color(52, 65, 142));  //sets the foreground color of the progress bar
        progressBar.setBackground(Color.BLACK);  //sets the background color of the progress bar
        progressBar.setValue(0);  //sets the initial value of the progress bar
        getContentPane().add(progressBar);  //adds the progress bar to the content pane
    }

    private void runningPBar() {
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);  //pauses execution for 50 milliseconds
                progressBar.setValue(i);  //updates the value of the progress bar
                loading.setText("LOADING... " + Integer.toString(i) + "%");  //updates the text of the loading label
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        HomeScreen wf = new HomeScreen();
        setVisible(false);  //hides the splash screen
        wf.setVisible(true);  //shows the home screen
        dispose();  //disposes the splash screen 
    }
}
