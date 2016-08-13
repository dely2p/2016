package d20160602;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class test extends JFrame{

	 static JFrameWin jFrameWindow;
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(runJFrameLater);
	    }
	     
	    public static class JFrameWin extends JFrame{
	          
	        public JFrameWin(){
	            this.setTitle("java-buddy.blogspot.com");
	            this.setSize(300, 200);
	            Color c = new Color(255,0,0);
	            //this.setBackground(c);
	            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	            BufferedImage bufferedImage = null;
	            try {
	                bufferedImage = ImageIO.read(this.getClass().getResource("./video_play.png"));
	            } catch (IOException ex) {
	                
	            }
	             
	            JLabel jLabel = new JLabel(new ImageIcon(bufferedImage));
	             
	            JPanel jPanel = new JPanel();
	            jPanel.add(jLabel);
	            jPanel.setBackground(c);
	            this.add(jPanel);
	        }
	          
	    }
	     
	    static Runnable runJFrameLater = new Runnable() {
	          
	        @Override
	        public void run() {
	            jFrameWindow = new JFrameWin();
	            jFrameWindow.setVisible(true);
	        }
	       
	    };
	 

}
