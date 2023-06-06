package Portfolio;

import javax.swing.JFrame;

public class BaseFrame extends JFrame {
	
public BaseFrame() {
    setUndecorated(true);  //removes the window decoration 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //sets default close operation
    setSize(1080, 720);  //sets size of the frame
    setLocationRelativeTo(null);  //centers the frame on the screen
}
}