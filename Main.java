package ShapePack;
import javax.swing.*;
import java.awt.*;



public class Main {
  public static void main(String[] args) {
	  JFrame jf = new JFrame("Ashwin");
	  jf.setSize(800, 600); //pixels
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  ShapeCanvas sc = new ShapeCanvas();
	  
	  
	  jf.getContentPane().add(sc);
	  jf.setVisible(true);
	  
	  jf.addMouseListener(sc); //adding for a mouselistener object
	  jf.addMouseMotionListener(sc); //allow dragging
	  
	  //JFrame creates a frame using the operating systems tools. Parameter "Ashwin" is the title of the frame
  }
}
